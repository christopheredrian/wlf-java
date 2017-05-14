<%-- 
    Document   : profile
    Created on : May 13, 2017, 3:32:13 PM
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
        <title>Profile</title>
        <style>
            input[type=text]{
                width:50%;
            }
        </style>
    </head>
    <body>
         <%@include file="partials/header.jsp" %>
         <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>

        <sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from `service provider` where sp_id = '201';
        </sql:query>
         <form method="post">
         <table class="table table-bordered">
             <c:forEach var = "row" items = "${result.rows}">
            <tr>
                <th>Service Provider Name</th>
                <td><c:out value = "${row.fname} ${row.lname}"/></td>
                </tr>
                <tr>
                <th>Address</th>
                <td><c:out value = "${row.address}"/></td>
                <td><input type="text" name="address"></td>
                </tr>
                <tr>
                <th>Telephone Number</th>
                <td><c:out value = "${row.tel_no}"/></td>
                <td><input type="text" name="tel_no"></td>
                </tr>
                <tr>
                <th>Email Address</th>
                <td><c:out value = "${row.email_address}"/></td>
                <td><input type="text" name="email_address"></td>
                </tr>
                <tr>
                <th>Birthday</th>
                <td><c:out value = "${row.birthday}"/></td>
                </tr>
                <tr>
                <th>Gender</th>
                <td><c:out value = "${row.gender}"/></td>
                </tr>
                <tr>
                <td></td>
                <td></td>
                <td><input type="submit" value="submit"></td>
                </tr>
            </c:forEach>
                <c:if test="${pageContext.request.method=='POST'}">
                <c:catch var="exception">
                <sql:update dataSource="${snapshot}" var="updatedTable">
                 UPDATE Customers
                SET address=?, tel_no=?, email_address=? WHERE sp_id='201'
                <sql:param value="${param.address}" />
                <sql:param value="${param.tel_no}" />
                <sql:param value="${param.email_address}" />
                </sql:update>
                <c:if test="${updatedTable>=1}">
                <font size="5" color='green'> Congratulations ! Data updated
                successfully.</font>
                </c:if>
                </c:catch>
                <c:if test="${exception!=null}">
                <c:out value="Unable to update data in database." />
                </c:if>
                </c:if>
        </table>       
    </body>
     <%@include file="partials/footer.jsp"%>  
</html>
