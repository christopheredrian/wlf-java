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
            SELECT requests.req_id, requests.cu_id, customer.fname, customer.lname, 
            requests.service_id, service_name, requests.date, requests.status 
            FROM requests INNER JOIN customer ON requests.cu_id=customer.cu_id 
            INNER JOIN `service provider` on `service provider`.sp_id = requests.sp_id
            inner join services on services.service_id = requests.service_id 
            WHERE `service provider`.username = ? and requests.status = 'Approved';
            <sql:param value="${sessionScope.username}"/>
        </sql:query>

        <table class="table table-bordered" id="data-table">
            <thead>
                <tr>
                    <th>Customer Name</th>
                    <th>Service Availed</th>
                    <th>Date</th>
                 
                </tr>
            </thead>

            <tbody>
                <c:forEach var = "row" items = "${result.rows}">
                    <tr>
                        <td><c:out value = "${row.fname} ${row.lname}"/></td>
                        <td><c:out value = "${row.service_name}"/></td>
                        <td><c:out value = "${row.date}"/></td>
                    </tr>
                </c:forEach>
            </tbody>

        </table>
    </body>
    <%@include file="partials/footer.jsp" %>
</html>
