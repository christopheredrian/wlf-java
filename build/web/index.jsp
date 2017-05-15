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
        <link href='fullcalendar/fullcalendar.min.css' rel='stylesheet' />
        <link href='fullcalendar/fullcalendar.print.min.css' rel='stylesheet' media='print' />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DashBoard</title>
    </head>



    <body>
        <%@include file="partials/header.jsp" %>
        <h1 class="page-header">Dashboard</h1>

        <div class="row">

            <a href="PenReq.jsp">
                <div class="col-md-5 col-sm-6 col-xs-13">
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
            <a href="TransHis.jsp">
                <div class="col-md-5 col-sm-6 col-xs-12">
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
        <div class="box box-info">
            <div class="box-header with-border">
                <h3 class="box-title">Calendar</h3>

                <div class="box-tools pull-right">
                    <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                    </button>
                    <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
                <div id='calendar'></div>
                <!-- /.table-responsive -->
            </div>
            <!-- /.box-body -->
            <!--            <div class="box-footer clearfix">
                            <a href="/admin/event/list" class="btn btn-sm btn-info btn-flat pull-right">View All Events</a>
                        </div>-->
            <!-- /.box-footer -->
        </div>
        <sql:query dataSource = "${snapshot}" var = "result">
            SELECT date as 'Date',  service_name as 'Service' FROM `webtek-database-finals`.requests NATURAL JOIN `service provider` NATURAL JOIN services ORDER BY DATE;        
        </sql:query>

        <script>

            window.addEventListener('DOMContentLoaded', function () {
                (function ($) {
                    $(document).ready(function () {
                        $('#calendar').fullCalendar({
                            header: {
                                left: 'prev,next today',
                                center: 'title',
                                right: 'month,basicWeek,basicDay,listYear,listWeek'
                            },
                            defaultDate: '2017-05-12',
                            navLinks: true, // can click day/week names to navigate views
                            editable: false,
                            eventLimit: true, // allow "more" link when too many events
                            events: [
            <c:forEach var = "row" items = "${result.rows}">
                                {

                                    title: '<c:out value = "${row.Service}"/>',
                                    start: '<c:out value = "${row.Date}"/>'
                                },

            </c:forEach>


                            ]

                        });
                    });
                }
                )(jQuery);
            });
        </script>
    </body>
    <script src='fullcalendar/lib/moment.min.js'></script>
    <script src="fullcalendar/lib/jquery.min.js"></script>
    <script src='fullcalendar/fullcalendar.min.js'></script>

    <%@include file="partials/footer.jsp"%> 
    <script src='fullcalendar/lib/moment.min.js'></script>
    <script src='fullcalendar/lib/jquery.min.js'></script>
    <script src='fullcalendar/fullcalendar.min.js'></script>
</html>
