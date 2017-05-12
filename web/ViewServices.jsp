<%-- 
    Document   : ViewServices
    Created on : May 7, 2017, 3:20:29 PM
    Author     : Jennelyn ocado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
     <title>View Services</title>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Services</title>
    </head>
     
    <body>
        <%@include file="partials/header.jsp" %>
       ${pangalan}
       
       <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/webtek_database_finals"
         user = "root"  password = ""/>
 
      <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from services;
      </sql:query>
 
      <table border = "1" width = "400">
         <tr>
            <th>Service ID</th>
            <th>Service Name</th>
            <th>Price</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.service_id}"/></td>
               <td><c:out value = "${row.service_name}"/></td>
               <td><c:out value = "${row.price}"/></td>
            </tr>
         </c:forEach>
      </table>
       
       
               
               
    </body>
    
    <%@include file="partials/footer.jsp" %>
</html>
