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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
    </head>
    <body>
        <%@include file="partials/header.jsp" %>
        
        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>
         <sql:query dataSource = "${snapshot}" var = "result">
                SELECT * FROM requests INNER JOIN customer ON requests.cu_id=customer.cu_id INNER JOIN invoice ON customer.cu_id=invoice.cu_id;
                
        </sql:query>
         <form method="post">       
         <table class="table table-bordered">
            <tr>
                <th>Customer Name</th>
                <th>Service Availed</th>
                <th>Target Date of Tutorial</th>
            </tr>

            <c:forEach var = "row" items = "${result.rows}">
                <tr>
                    <td><c:out value = "${row.fname} ${row.lname}"/></td>
                    <td><c:out value = "${row.serviceAvailed}"/></td>
                    <td><c:out value = "${row.date}"/></td>
                    <td><input type="submit" value="approve">
                        <sql:update dataSource="${snapshot}" var="dbResult">
                                UPDATE requests SET status=? where req_id='';
                            <sql:param value="Approved" />
                         </sql:update>
                        <input type="submit" value="decline">
                        <sql:update dataSource="${snapshot}" var="dbResult">
                                UPDATE requests SET status=?;
                            <sql:param value="Pending" />
                         </sql:update>

                    </td>
                </tr>
            </c:forEach>
         </table>
             
             
         </form>
                
                
          
        
    </body>
        <%@include file="partials/footer.jsp" %>
</html>
