<%-- 
    Document   : profile
    Created on : May 13, 2017, 3:32:13 PM
    Author     : Jennelyn ocado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            input[type=text]{
                width:50%;
            }
        </style>
    </head>
    <body>
         <%@include file="partials/header.jsp" %>
         <input type ="text" placeholder="Service ID" class="form-control">
         
        <textarea rows="1" cols="50" name="comment" form="usrform">Service Providers Name</textarea>
        <br>
        <textarea rows="1" cols="50" name="comment" form="usrform" >Service Providers Name</textarea>
        <button class = "button">edit</button>
    </body>
     <%@include file="partials/footer.jsp"%>  
</html>
