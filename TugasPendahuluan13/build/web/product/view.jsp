<%-- 
    Document   : view
    Created on : Dec 9, 2024, 1:57:23 AM
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
                background-color: #ffffff;
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
        <h1>Data Barang</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Jumlah</th>
                <th>Harga</th>
                <th>Actions</th>
            </tr>
            <%
                JDBC jdbc = new JDBC(); // Pastikan class JDBC sudah dibuat dan dikonfigurasi
                if (jdbc.isConnected) {
                    try {
                        ResultSet rs = jdbc.stmt.executeQuery("SELECT * FROM barang");
                        while (rs.next()) {
                            int id = rs.getInt("ID");
                            String nama = rs.getString("nama");
                            int jumlah = rs.getInt("jumlah");
                            double harga = rs.getDouble("harga");

                            out.println("<tr>");
                            out.println("<td>" + id + "</td>");
                            out.println("<td>" + nama + "</td>");
                            out.println("<td>" + jumlah + "</td>");
                            out.println("<td>" + harga + "</td>");
                            out.println("<td>");
                            out.println("<a href='edit.jsp?id=" + id + "'><button>Edit</button></a>");
                            out.println("</td>");
                            out.println("</tr>");
                        }
                    } catch (SQLException e) {
                        out.println("<tr><td colspan='5'>Error: " + e.getMessage() + "</td></tr>");
                    }
                } else {
                    out.println("<tr><td colspan='5'>Database connection failed: " + jdbc.message + "</td></tr>");
                }
            %>
        </table>
        <div class="btn-container">
            <a href="add.jsp">
                <button>Add New Data</button>
            </a>
        </div>
    </div>
</body>

</html>
