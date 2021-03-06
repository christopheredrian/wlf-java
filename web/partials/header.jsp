<%-- 
    Document   : index
    Created on : May 7, 2017, 2:29:05 PM
    Author     : Jennelyn ocado
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Service Provider Module</title>
    </head>
    <body>
        <!DOCTYPE html>
    <!--
    This is a starter template page. Use this page to start your new project from
    scratch. This page gets rid of all links and provides the needed markup only.
    -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 2 | Starter</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" href="dist/css/skins/skin-green.min.css">
    <link href='fullcalendar/fullcalendar.min.css' rel='stylesheet'/>
    <link href='fullcalendar/fullcalendar.print.min.css' rel='stylesheet' media='print'/>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-green sidebar-mini">
    <div class="wrapper">

        <!-- Main Header -->
        <header class="main-header">

            <!-- Logo -->
            <a href="index.jsp" class="logo">
                <!-- mini logo for sidebar mini 50x50 pixels -->
                <span class="logo-mini"><b>S</b>P</span>
                <!-- logo for regular state and mobile devices -->
                <span class="logo-lg"><b>Service</b>Provider</span>
            </a>
            <!-- Header Navbar -->
            <nav class="navbar navbar-static-top" role="navigation">
                <!-- Sidebar toggle button-->
                <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Toggle navigation</span>
                </a>
                <!-- Navbar Right Menu -->
                <div class="navbar-custom-menu">
                    <ul class="nav navbar-nav">
                        <!-- Messages: style can be found in dropdown.less-->
                        <li class="dropdown messages-menu">
                            <!-- Menu toggle button -->

                            <ul class="dropdown-menu">
                                <!-- inner menu: contains the messages -->
                                <ul class="menu">
                                    <li><!-- start message -->
                                        <a href="#">
                                            <div class="pull-left">
                                                <!-- User Image -->
                                                <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <!-- Message title and timestamp -->
                                            <h4>
                                                Support Team
                                                <small><i class="fa fa-clock-o"></i> 5 mins</small>
                                            </h4>
                                            <!-- The message -->
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                    <!-- end message -->
                                </ul>
                                <!-- /.menu -->
                        </li>
                        <li class="footer"><a href="#">See All Messages</a></li>
                    </ul>
                    </li>
                    <!-- /.messages-menu -->

                    <!-- Notifications Menu -->
                    <li class="dropdown notifications-menu">
                        <!-- Menu toggle button -->

                        <ul class="dropdown-menu">

                            <li>
                                <!-- Inner Menu: contains the notifications -->
                                <ul class="menu">
                                    <li><!-- start notification -->

                                    </li>
                                    <!-- end notification -->
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <!-- Notifications Menu -->

                    <!-- Tasks Menu -->
                    <li class="dropdown tasks-menu">
                        <!-- Menu Toggle Button -->
                        <ul class="dropdown-menu">

                            <li>
                                <!-- Inner menu: contains the tasks -->
                                <ul class="menu">

                                    <!-- end task item -->
                                </ul>
                            </li>
                            <li class="footer">

                            </li>
                        </ul>
                    </li>
                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu">
                        <!-- Menu Toggle Button -->
<!--                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                             The user image in the navbar
                            <img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                             hidden-xs hides the username on small devices so only the image appears. 
                            <span class="hidden-xs">Alexander Pierce</span>
                        </a>
                        <ul class="dropdown-menu">
                             The user image in the menu 
                            <li class="user-header">
                                <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                            </li>
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="profile.jsp" class="btn btn-default btn-flat">Profile</a>
                                </div>
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">Sign out</a>
                                </div>
                            </li>
                        </ul>-->
                    </li>
                    <!-- Control Sidebar Toggle Button -->
                    <li>
                        <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                           url = "jdbc:mysql://localhost/webtek-database-finals"
                           user = "root"  password = ""/>
                        <sql:query dataSource = "${snapshot}" var = "result">
                            SELECT CONCAT(fname, " ",lname) name
                            FROM `service provider`
                            WHERE `service provider`.username = ?;
                            <sql:param value="${sessionScope.username}"/>
                        </sql:query>
                        
                   

                    </li>
                   
                    <li>
                        <c:forEach var = "row" items = "${result.rows}">
                        <a data-toggle="control-sidebar"><i class="fa fa-user"></i> <c:out value="${row.name}"/></a>

                            <style>
                                p.page-header {
                                    color: whitesmoke;
                                }
                            </style>
                        </c:forEach>
                    </li>
                   
                    </ul>
                </div>
            </nav>
        </header>
        <!-- Left side column. contains the logo and sidebar -->
        <aside class="main-sidebar">

            <!-- sidebar: style can be found in sidebar.less -->
            <section class="sidebar">

                <!-- Sidebar user panel (optional) -->


                <ul class="sidebar-menu">
                    <li class="header">Main Navigation</li>
                    <!-- Optionally, you can add icons to the links -->
                    <!--Dashboard-->
                    <li class="treeview">
                        <a href="index.jsp"><i class="fa fa-dashboard"></i> <span>Dashboard</span> </a>
                        <!-- Dashboard -->
                    </li>
                </ul>
                <!-- Sidebar Menu -->
                <ul class="sidebar-menu">
                    <li class="header">Service Management</li>

                    <li class="treeview">
                    <li><a href="Services.jsp"><i class="fa fa-car"></i>Services</a></li>
                    <li><a href="AddServices.jsp"><i class="fa fa-book"></i>Add Services</a></li>
                    <li><a href="PenReq.jsp"><i class="fa fa-clock-o"></i>Pending Requests</a></li>
                    <li><a href="Arrangement.jsp"><i class="fa fa-dollar"></i>Arrangements</a></li>
                    <li><a href="TransHis.jsp"><i class="fa fa-dollar"></i>Transactions</a></li>

                </ul>

                <ul class="sidebar-menu">
                    <li class="header">Others</li>

                    <li class="treeview">
                    <li><a href="profile.jsp"><i class="fa fa-pencil"></i>Account Settings</a></li>
                     <li>
                        <a href="logout" data-toggle="control-sidebar"><i class="fa fa-user"></i> Logout</a>
                    </li>


                </ul>
                <!-- /.sidebar-menu -->
            </section>
            <!-- /.sidebar -->
        </aside>

        <!-- Content Wrapper. Contains page content -->
        <div class="content-wrapper">
            <!-- Content Header (Page header) -->
            <section class="content-header">
                <!-- REQUIRED JS SCRIPTS -->



