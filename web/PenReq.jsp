<%-- 
    Document   : PenReq
    Created on : May 7, 2017, 3:26:10 PM
    Author     : Jennelyn ocado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
    <title>Pending Requests</title>
    <head>
        <link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <%@include file="partials/header.jsp" %>

        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>
        <sql:query dataSource = "${snapshot}" var = "result">
            SELECT requests.req_id, requests.cu_id, fname, lname, serviceAvailed, requests.date, requests.status FROM requests INNER JOIN customer ON requests.cu_id=customer.cu_id INNER JOIN invoice ON customer.cu_id=invoice.cu_id;

        </sql:query>
        <h1 class="page-header" style="margin-bottom: 40px">Pending Requests</h1>

        <table id="data-table" class="table table-bordered">
            <thead>
                <tr>
                    <th>Customer Name</th>
                    <th>Service Availed</th>
                    <th>Target Date of Tutorial</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var = "row" items = "${result.rows}">
                    <tr>
                        <td><c:out value = "${row.fname} ${row.lname}"/></td>
                        <td><c:out value = "${row.serviceAvailed}"/></td>
                        <td><c:out value = "${row.date}"/></td>
                        <td><c:out value = "${row.status}"/></td>
                        <td>
                            <form action="approve" method="post">
                                <input type="hidden" name="cu_id" value="${row.cu_id}">
                                <input type="hidden" name="req_id" value="${row.req_id}">
                                <button type="submit" class="btn btn-flat btn-success btn-block">
                                    Approve
                                </button>
                            </form>
                            <form action="reject" method="post">
                                <input type="hidden" name="req_id" value="${row.req_id}">
                                <input type="hidden" name="cu_id" value="${row.cu_id}">
                                <button type="submit" class="btn btn-flat btn-danger btn-block">
                                    Reject
                                </button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
        <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
    </body>
    <%@include file="partials/footer.jsp" %>
</html>
