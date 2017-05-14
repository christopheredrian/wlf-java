<%-- 
    Document   : AddServices
    Created on : May 14, 2017, 3:35:15 PM
    Author     : Mark
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Add Service</title>
    </head>
    <%@include file="partials/header.jsp" %>

        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>   
        <h1 class="page-header">Add Services</h1>
        <form method="post">
        <table class="table table-bordered">
            <tr>
                <th>Service Name</th>
                <td><input type="text" name="service_id"></td>
                </tr>
                <tr>
                <th>Service Description</th>
                <td><input type="text" name="service_name"></td>
                </tr>
                <tr>
                <th>Price</th>
                <td><input type="text" name="price"></td>
                <tr>
                <td></td>
                <td><input type="submit" value="submit"></td>
                </tr>
            </tr>

        </table>
        </form>
        <c:if test="${pageContext.request.method=='POST'}">
        <c:catch var="exception">
        <sql:update dataSource="${snapshot}" var="updatedTable">
        INSERT INTO services (service_name,description,price) VALUES (?, ?, ?)
        <sql:param value="${param.service_name}" />
        <sql:param value="${param.description}" />
        <sql:param value="${param.price}" />
        </sql:update>
        <c:if test="${updatedTable>=1}">
        <font size="5" color='green'> Congratulations ! Data inserted
        successfully.</font>
        </c:if>
        </c:catch>
        <c:if test="${exception!=null}">
        <c:out value="Unable to insert data in database." />
        </c:if>
        </c:if>

    </body>
    <%@include file="partials/footer.jsp" %>
</html>
