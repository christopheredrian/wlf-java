<%-- 
    Document   : AppReq
    Created on : May 7, 2017, 3:24:43 PM
    Author     : Jennelyn ocado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Approved Requests</title>
    </head>
    <body>
        <%@include file="partials/header.jsp" %>
        
        
   
        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>

        <sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from requests;
        </sql:query>

        <table class="table table-bordered">
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
