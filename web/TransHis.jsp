<%-- 
    Document   : TransHis
    Created on : May 7, 2017, 3:24:25 PM
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
        <title>Transaction History</title>
    </head>
    <body>
        <%@include file="partials/header.jsp" %>
        
        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>
         <sql:query dataSource = "${snapshot}" var = "result">
                SELECT * FROM customer;
        </sql:query>
        
        <table class="table table-bordered">
            <tr>
                <th>Customer Name</th>
                <th>Service Availed</th>
                <th>Price</th>
            </tr>

            <c:forEach var = "row" items = "${result.rows}">
                <tr>
                    <td><c:out value = "${row.fname} ${row.lname}"/></td>
                    <td><c:out value = "${row.serviceAvailed}"/></td>
                    <td><c:out value = "${row.lname}"/></td>
                </tr>
            </c:forEach>
          
        </table>
    </body>
         <%@include file="partials/footer.jsp" %>
</html>
