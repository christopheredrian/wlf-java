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

        </style>
    </head>
    <body>
        <%@include file="partials/header.jsp" %>
        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>

        <sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from `service provider` where username = ?
            <sql:param value="${sessionScope.username}"/>
        </sql:query>
        <h1 class="page-header" style="border-bottom: 1px solid gray">Edit Profile</h1>
        <form method="post" style="width: 80%; padding: 5%">
            <c:forEach var = "row" items = "${result.rows}">
                <div class="form-group">
                    <label> Service Provider Name</label>
                    <input readonly class="form-control" type="text" name="username" value="<c:out  value = "${row.fname} ${row.lname}"/>">
                </div>

                <div class="form-group">
                    <label>Address</label>
                    <input class="form-control" type="text" name="address" value="${row.address}" required/>
                </div>

                <div class="form-group">
                    <label>Telephone Number</label>
                    <input class="form-control" type="text" name="tel_no" value="${row.tel_no}" required/>
                </div>  

                <div class="form-group">
                    <label>Email Address</label>
                    <input class="form-control" type="email" name="email_address" value="${row.email_address}" required/>
                </div>

                <div class="form-group">
                    <label>Birthday</label>
                    <input readonly class="form-control" type="text" name="birthday" value=" <c:out value = "${row.birthday}"/>">


                </div>

                <div class="form-group">
                    <label>  Gender</label>
                    <label class="form-control">
                        <c:if test="${row.gender == 'm'}">
                            Male
                        </c:if>
                        <c:if test="${row.gender == 'f'}">
                            Female
                        </c:if>
                    </label>
                </div>

                <input class="btn btn-info btn-flat pull-right" type="submit" value="Update">
            </c:forEach>
            <c:if test="${pageContext.request.method=='POST'}">
                <c:catch var="exception">
                    <sql:update dataSource="${snapshot}" var="updatedTable">
                        UPDATE `service provider`
                        SET address=?, tel_no=?, email_address=? WHERE username=?
                        <sql:param value="${param.address}" />
                        <sql:param value="${param.tel_no}" />
                        <sql:param value="${param.email_address}"/>
                        <sql:param value="${sessionScope.username}"/>
                    </sql:update>
                    <c:if test="${updatedTable>=1}">
                        <c:redirect url="profile.jsp"/>
                    </c:if>
                </c:catch>
                <c:if test="${exception!=null}">
                    <c:out value="Unable to update data in database." />
                </c:if>
            </c:if>
            </body>
            <%@include file="partials/footer.jsp"%>  
            </html>
