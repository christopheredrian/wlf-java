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
<!-- jQuery 2.2.3 -->
        <script src="bootstrap/js/jquery-2.2.3.min.js"></script>
        <!-- Bootstrap 3.3.6 -->
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <!-- iCheck -->
        <script src="bootstrap/js/icheck.min.js"></script>
    
        <script src="bootstrap/js/jquery.validate.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Add Service</title>
        <style>
            #sd{
                width: 850px;
                height: 150px;
            }
                
            #ab {
                width: 850px;
                height: 30px;
                }
        </style>
    </head>
    <%@include file="partials/header.jsp" %>
    
    



    <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                       url = "jdbc:mysql://localhost/webtek-database-finals"
                       user = "root"  password = ""/>   
    <h1 class="page-header">Add Services <i class="glyphicon glyphicon-book"></i></h1>
    <form method="post">
        <table class="table">
            <tr>
                <th>Service Name</th>
                <td><input id="ab" type="text" name="service_name" required></td>
            </tr>
             <tr>
                <th>Price</th>
                <td><input id="ab" type="number" name="price" required></td>
            <tr>
            <tr>
                <th>Service Description</th>
                <td><input id="sd" type="text" name="description" required></td>
            </tr>
                <td></td>
                <td><input type="submit" value="submit"></td>
            </tr>
            </tr>

        </table>
    </form>
    <c:if test="${pageContext.request.method=='POST'}">
        <c:catch var="exception">
            <sql:update dataSource="${snapshot}" var="updatedTable">
                INSERT INTO services (service_name,description,price,sp_id) 
                VALUES (?, ?, ?, ?)
                <sql:param value="${param.service_name}" />
                <sql:param value="${param.description}" />
                <sql:param value="${param.price}" />
                <sql:param value="${sessionScope.sp_id}" />
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


        <script>
            $(function () {
                $('input').iCheck({
                    checkboxClass: 'icheckbox_square-blue',
                    radioClass: 'iradio_square-blue',
                increaseArea: '20%' // optional
            });
                $("form").validate({
                 rules: {
                    service_name: "required",
                    description: "required",
                    price: {
                        required: true,
                        minlength: 6,
                    },
                    messages: {
                        sevice_name: "Please enter your name",
                        description: "Please enter your decription",
                        price: "Please enter price as a number"
                    }
                 }
    // Specify validation error messages

    // Make sure the form is submitted to the destination defined
    // in the "action" attribute of the form when valid
    submitHandler: function(form) {
      form.submit();
  }
});
                
            });
            $("#AddServices").validate();
        </script>
</body>
<%@include file="partials/footer.jsp" %>
</html>
