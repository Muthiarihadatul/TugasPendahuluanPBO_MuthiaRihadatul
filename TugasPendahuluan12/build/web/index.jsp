<%-- 
    Document   : index
    Created on : Dec 2, 2024, 4:35:43 AM
    Author     : Muthia Rihadatul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tugas Pendahuluan 12</title>
    </head>
    
    <form method="get" action="PrakServlet">
        NIM: <input type="text" name="nim" /><br />
        Nama: <input type="text" name="nama" /><br />
        <input type="submit" value="Kirim" />
    </form>
    <%
        out.print(request.getAttribute("nim") + "<br />");
        out.print(request.getAttribute("nama") + "<br />");
    %>
    

    
</html>
