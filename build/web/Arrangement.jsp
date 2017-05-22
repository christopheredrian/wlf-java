<%-- 
    Document   : Arrangement
    Created on : May 18, 2017, 4:36:25 PM
    Author     : Mark
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


        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>

        <sql:query dataSource = "${snapshot}" var = "result">
            SELECT arrangement.arrangement_id, arrangement.cu_id, customer.fname, customer.lname, 
            arrangement.service_id, service_name, arrangement.date, arrangement.targetDate 
            FROM arrangement INNER JOIN customer ON arrangement.cu_id=customer.cu_id 
            INNER JOIN `service provider` on `service provider`.sp_id = arrangement.sp_id
            inner join services on services.service_id = arrangement.service_id 
            WHERE `service provider`.username = ?;
            <sql:param value="${sessionScope.username}"/>
        </sql:query>
        <h1 class="page-header" style="margin-bottom: 40px">Arrangements</h1>
        <table class="table table-bordered" id="data-table">
            <thead>
                <tr>
                    <th>Customer Name</th>
                    <th>Service Availed</th>
                    <th>Date of Request</th>
                    <th>Target Date</th>
                    <th>Action</th>

                </tr>
            </thead>
            <tbody>

                <c:forEach var = "row" items = "${result.rows}">
                    <tr>
                        <td><c:out value = "${row.fname} ${row.lname}"/></td>
                        <td><c:out value = "${row.service_name}"/></td>
                        <td><c:out value = "${row.date}"/></td>
                        <td><c:out value = "${row.targetDate}"/></td>
                        <td>
                            <form action="mark" method="post">
                                <input type="hidden" name="cu_id" value="${row.cu_id}">
                                <input type="hidden" name="req_id" value="${row.req_id}">
                                <button type="submit" class="btn btn-flat btn-success btn-block">
                                    Mark as Paid
                                </button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
    <%@include file="partials/footer.jsp" %>
</html>
