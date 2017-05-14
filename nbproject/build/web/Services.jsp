<%-- 
    Document   : EditServices
    Created on : May 7, 2017, 3:22:22 PM
    Author     : Jennelyn ocado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Services</title>
    </head>
    <body>
         <%@include file="partials/header.jsp" %>
         ${pangalan}
         
         
   
        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>

        <sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from services;
        </sql:query>
            

        <table class="table table-bordered">
            <tr>
                <th>Service Name</th>
                <th>Service Description</th>
                <th>Price</th>
                <th><a href="AddServices.jsp" class="btn btn-info" role="button">Add Service</a></th>
            </tr>

            <c:forEach var = "row" items = "${result.rows}">
                <tr>
                    <td><c:out value = "${row.service_name}"/></td>
                    <td><c:out value = "${row.description}"/></td>
                    <td><c:out value = "${row.price}"/></td
                </tr>
            </c:forEach>
        </table>

    </body>
    <%@include file="partials/footer.jsp" %>
</html>
