<%-- 
    Document   : jdbc
    Created on : Dec 1, 2024, 7:09:22?AM
    Author     : Muthia Rihadatul
--%>

<%@page import="classes.JDBC"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tugas pendahuluan 12</title>
    </head>
    
    <% 
        JDBC db = new JDBC();
        if (db.isConnected) {
            out.print(db.message + "<br />");
            db.runQuery("INSERT INTO mahasiswa (nama, jurusan, angkatan, ipk) VALUES ('sulton syamil', 'ilmu komunikasi', 2025, 3.8)");
            out.print(db.message + "<br />");
            db.disconnect();
            out.print(db.message + "<br />");
        } else {
            out.print(db.message + "<br />");
        } 
    %>
</html>
