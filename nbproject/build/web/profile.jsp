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
        <title>Profile</title>
        <style>
            input[type=text]{
                width:50%;
            }
        </style>
    </head>
    <body>
         <%@include file="partials/header.jsp" %>
         <input type ="text" placeholder="Service ID" readonly class="form-control">
         <input type ="text" placeholder="Service Provider's Name" readonly class="form-control">
         <input type ="text" placeholder="Gender" readonly class="form-control">
         <input type ="text" placeholder="SP Address" class="form-control">
        <input type ="text" placeholder="Contact Number" class="form-control">
         <input type ="text" placeholder="Brithday" class="form-control">
        <input type ="text" placeholder="Civil Status" class="form-control">
         <input type ="text" placeholder="Email Address" class="form-control">
        <input type ="text" placeholder="Password" class="form-control">

        
        
        <form action="profile.jsp" method="get" id="profile"></form>
        <button type="Save" form="profile" value="Save">Save</button>
        <br>
         <form action="profile.jsp" method="get" id="profile"></form>
        <button type="Cancel" form="profile" value="Cancel">Cancel</button>
    </body>
     <%@include file="partials/footer.jsp"%>  
</html>
