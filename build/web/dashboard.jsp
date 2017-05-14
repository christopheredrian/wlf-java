<%-- 
    Document   : dashboard
    Created on : May 14, 2017, 1:44:51 PM
    Author     : Jennelyn ocado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DashBoard</title>
    </head>



    <body>
        <%@include file="partials/header.jsp" %>


        <a href="PenReq.jsp">
            <h1 class="page-header">Dashboard</h1>
            <div class="row">
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="info-box">
                        <span class="info-box-icon bg-aqua"><i class="fa fa-clock-o"></i></span>
                        <div class="info-box-content">
                            <span class="info-box-text">Pending Request</span>
                            <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                                               url = "jdbc:mysql://localhost/webtek-database-finals"
                                               user = "root"  password = ""/>
                            <sql:query dataSource = "${snapshot}" var = "result">
                                SELECT COUNT(*) as 'requestsCount' from requests WHERE status = 'Pending';
                            </sql:query>
                            <span class="info-box-number"> ${result.rows[0].requestsCount}</span>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                    <!-- /.info-box -->
                </div>
        </a>
        <a href="AppReq.jsp">
            <div class="col-md-3 col-sm-6 col-xs-12">
                <div class="info-box">
                    <span class="info-box-icon bg-red"><i class="fa fa-thumbs-o-up"></i></span>

                    <div class="info-box-content">
                        <span class="info-box-text">Approved Request</span>
                        <sql:query dataSource = "${snapshot}" var = "result">
                            SELECT COUNT(*) as 'approvedRequests' from requests WHERE status = 'Approved';
                        </sql:query>
                        <span class="info-box-number"> ${result.rows[0].approvedRequests}</span>
                    </div>
                    <!-- /.info-box-content -->
                </div>
                <!-- /.info-box -->
            </div>
        </a>
        <a href="TransHis.jsp">
            <div class="col-md-3 col-sm-6 col-xs-12">
                <div class="info-box">
                    <span class="info-box-icon bg-green"><i class="fa fa-dollar"></i></span>

                    <div class="info-box-content">
                        <span class="info-box-text">Transaction History</span>
                        <sql:query dataSource = "${snapshot}" var = "result">
                            SELECT COUNT(*) as 'approvedRequests' from invoice WHERE sp_id = '209';
                        </sql:query>
                        <span class="info-box-number"> ${result.rows[0].approvedRequests}</span>
                    </div>
                    <!-- /.info-box-content -->
                </div>
                <!-- /.info-box -->
            </div>
        </a>
    </div>
</body>
<%@include file="partials/footer.jsp"%> 
</html>
