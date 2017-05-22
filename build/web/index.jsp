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
                                SELECT COUNT(*) as 'requestsCount' from requests inner join `service provider` 
                                on `service provider`.sp_id = requests.sp_id WHERE status = 'Pending' and username = ?;
                                <sql:param value="${sessionScope.username}"/>
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
                                SELECT COUNT(*) as 'invoice' from invoice 
                                INNER JOIN `service provider` on `service provider`.sp_id = invoice.sp_id 
                                WHERE username = ?;
                                <sql:param value="${sessionScope.username}"/>
                            </sql:query>
                            <span class="info-box-number"> ${result.rows[0].invoice}</span>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                    <!-- /.info-box -->
                </div>
            </a>
            <div class="box box-info col-xs-12 pull-left">
                <div class="col-xs-12" style="margin: 10px; padding: 10px">
                    <div class="box-header with-border">
                        <h3 class="box-title">Calendar</h3>

                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                            </button>
                            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body" >
                        <div id='calendar' ></div>
                        <!-- /.table-responsive -->
                    </div>
                    <!-- /.box-body -->
                    <!--            <div class="box-footer clearfix">
                                    <a href="/admin/event/list" class="btn btn-sm btn-info btn-flat pull-right">View All Events</a>
                                </div>-->
                    <!-- /.box-footer -->
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">


            </div>
        </div>
        <div class="box box-info col-xs-12 pull-left" >
            <div class="col-xs-12" style="margin: 0 !important; padding: 0">
                <div class="box-header ">

                    <div class="box-tools pull-right">
                        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                        </button>
                        <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                    </div>
                </div>
                <!-- /.box-header -->
                <div class="box-body" >
                    <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                                       url = "jdbc:mysql://localhost/webtek-database-finals"
                                       user = "root"  password = ""/>
                    <sql:query dataSource = "${snapshot}" var = "result">
                        SELECT requests.req_id, requests.cu_id, customer.fname, customer.lname, 
                        requests.service_id, service_name, requests.date, requests.targetDate, requests.status 
                        FROM requests INNER JOIN customer ON requests.cu_id=customer.cu_id 
                        INNER JOIN `service provider` on `service provider`.sp_id = requests.sp_id
                        INNER JOIN services on services.service_id = requests.service_id 
                        WHERE `service provider`.username = ? and requests.status = 'Pending' ORDER BY date;
                        <sql:param value="${sessionScope.username}"/>

                    </sql:query>
                    <h1 class="page-header" style="margin-bottom: 40px">Pending Requests</h1>
                    <c:if test="${message!=null}">
                        <div class="alert alert-success">
                            <strong class="">Success!</strong> ${message}
                        </div>
                    </c:if>
                    <table class="table table-striped table-responsive data-table">
                        <thead>
                            <tr>

                                <th>Customer Name</th>
                                <th>Service Availed</th>
                                <th>Target Date of Tutorial</th>
                                <th>Date of Request</th>
                                <th>Action</th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach var = "row" items = "${result.rows}">
                                <tr>

                                    <td><c:out value = "${row.fname} ${row.lname}"/></td>
                                    <td><c:out value = "${row.service_name}"/></td>
                                    <td><c:out value = "${row.targetDate}"/></td>
                                    <td><c:out value = "${row.date}"/></td>

                                    <td>
                                        <c:if test="${row.status == 'Pending'}">
                                            <form action="approve" method="post">
                                                <input type="hidden" name="cu_id" value="${row.cu_id}">
                                                <input type="hidden" name="req_id" value="${row.req_id}">
                                                <button type="submit" class="btn btn-flat btn-success btn-block">
                                                    Approve
                                                </button>
                                            </form>
                                            <form action="reject" method="post">
                                                <input type="hidden" name="req_id" value="${row.req_id}">
                                                <input type="hidden" name="cu_id" value="${row.cu_id}">
                                                <button type="submit" class="btn btn-flat btn-danger btn-block">
                                                    Reject
                                                </button>
                                            </form>
                                        </c:if>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <!-- /.table-responsive -->
                </div>
                <!-- /.box-body -->
                <!--            <div class="box-footer clearfix">
                                <a href="/admin/event/list" class="btn btn-sm btn-info btn-flat pull-right">View All Events</a>
                            </div>-->
                <!-- /.box-footer -->
            </div>

        </div>
        <sql:query dataSource = "${snapshot}" var = "result">
            SELECT targetDate,service_name 
            FROM arrangement
            INNER JOIN services on services.service_id = arrangement.service_id 
            WHERE `arrangement`.sp_id = ?
            ORDER BY DATE;
            <sql:param value="${sessionScope.sp_id}"/>
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

                                    title: '<c:out value = "${row.service_name}"/>',
                                    start: '<c:out value = "${row.targetDate}"/>'
                                },

            </c:forEach>


                            ]

                        });
                    });
                }
                )(jQuery);
            });
        </script>
        <script src='fullcalendar/lib/moment.min.js'></script>
        <script src="fullcalendar/lib/jquery.min.js"></script>
        <script src='fullcalendar/fullcalendar.min.js'></script>

        <%@include file="partials/footer.jsp"%> 
        <script src='fullcalendar/lib/moment.min.js'></script>
        <script src='fullcalendar/lib/jquery.min.js'></script>
        <script src='fullcalendar/fullcalendar.min.js'></script>
    </body>

</html>
