<%-- 
    Document   : edit
    Created on : Dec 9, 2024, 1:57:12 AM
    Author     : Muthia Rihadatul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="classes.JDBC" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f9f9f9;
                margin: 0;
                padding: 0;
                text-align: center;
            }

            h1 {
                color: #333;
                margin-top: 20px;
                margin-bottom: 20px;
            }

            table {
                margin: 20px auto;
                border-collapse: collapse;
                width: 80%;
                background-color: white;
                box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
            }

            table th, table td {
                border: 1px solid #ddd;
                padding: 12px;
                text-align: center;
            }

            table th {
                background-color: #f4f4f4;
                color: #333;
                font-weight: bold;
            }

            table tr:nth-child(even) {
                background-color: #f9f9f9;
            }

            table tr:hover {
                background-color: #f1f1f1;
            }

            button {
                background-color: #007BFF;
                color: white;
                border: none;
                padding: 8px 15px;
                border-radius: 4px;
                cursor: pointer;
                font-size: 14px;
            }

            button:hover {
                background-color: #0056b3;
            }

            .btn-container {
                margin: 20px auto;
                text-align: center;
            }

            .btn-container a {
                text-decoration: none;
            }

            .btn-container button {
                background-color: #007BFF;
                color: white;
                border: none;
                padding: 10px 20px;
                border-radius: 4px;
                font-size: 16px;
                cursor: pointer;
            }

            .btn-container button:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Edit Data</h1>

            <%
                JDBC dbc = new JDBC();
                String id = request.getParameter("id");
                String nama = "";
                String jumlah = "";
                String harga = "";
                String message = "";

                if (id != null) {
                    if (dbc.isConnected) {
                        try {
                            ResultSet rs = dbc.stmt.executeQuery("SELECT * FROM barang WHERE ID = " + id);
                            if (rs.next()) {
                                nama = rs.getString("nama");
                                jumlah = String.valueOf(rs.getInt("jumlah"));
                                harga = String.valueOf(rs.getDouble("harga"));
                            }
                        } catch (SQLException e) {
                            out.println("<p>Error: " + e.getMessage() + "</p>");
                        }
                    }
                }

                String newNama = request.getParameter("newNama");
                String newJumlah = request.getParameter("newJumlah");
                String newHarga = request.getParameter("newHarga");

                if (newNama != null && newJumlah != null && newHarga != null) {
                    String updateQuery = "UPDATE barang SET nama = '" + newNama + "', jumlah = " + newJumlah + ", harga = " + newHarga + " WHERE ID = " + id;
                    dbc.runQuery(updateQuery);
                    message = dbc.message;
                }
            %>

            <% if (!message.isEmpty()) { %>
                <div class="message">
                    <p><%= message %></p>
                </div>
            <% } %>

            <form action="edit.jsp" method="post">
                <input type="hidden" name="id" value="<%= id %>">

                <label>Nama:</label>
                <input type="text" name="newNama" value="<%= nama %>" required><br>

                <label>Jumlah:</label>
                <input type="number" name="newJumlah" value="<%= jumlah %>" required><br>

                <label>Harga:</label>
                <input type="number" step="0.01" name="newHarga" value="<%= harga %>" required><br>

                <button type="submit">Update</button>
            </form>

            <div class="btn-container">
                <a href="view.jsp">
                    <button class="back-btn">Back to View</button>
                </a>
            </div>
        </div>

    </body>
</html>