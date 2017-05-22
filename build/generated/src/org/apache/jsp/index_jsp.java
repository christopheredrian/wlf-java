package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/partials/header.jsp");
    _jspx_dependants.add("/partials/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_param_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_param_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_param_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link href='fullcalendar/fullcalendar.min.css' rel='stylesheet' />\r\n");
      out.write("        <link href='fullcalendar/fullcalendar.print.min.css' rel='stylesheet' media='print' />\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>DashBoard</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Service Provider Module</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!DOCTYPE html>\r\n");
      out.write("    <!--\r\n");
      out.write("    This is a starter template page. Use this page to start your new project from\r\n");
      out.write("    scratch. This page gets rid of all links and provides the needed markup only.\r\n");
      out.write("    -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>AdminLTE 2 | Starter</title>\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\r\n");
      out.write("    <!-- Ionicons -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("    <!-- Theme style -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\r\n");
      out.write("    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter\r\n");
      out.write("          page. However, you can choose any other skin. Make sure you\r\n");
      out.write("          apply the skin class to the body tag so the changes take effect.\r\n");
      out.write("    -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/skins/skin-green.min.css\">\r\n");
      out.write("    <link href='fullcalendar/fullcalendar.min.css' rel='stylesheet'/>\r\n");
      out.write("    <link href='fullcalendar/fullcalendar.print.min.css' rel='stylesheet' media='print'/>\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<!--\r\n");
      out.write("BODY TAG OPTIONS:\r\n");
      out.write("=================\r\n");
      out.write("Apply one or more of the following classes to get the\r\n");
      out.write("desired effect\r\n");
      out.write("|---------------------------------------------------------|\r\n");
      out.write("| SKINS         | skin-blue                               |\r\n");
      out.write("|               | skin-black                              |\r\n");
      out.write("|               | skin-purple                             |\r\n");
      out.write("|               | skin-yellow                             |\r\n");
      out.write("|               | skin-red                                |\r\n");
      out.write("|               | skin-green                              |\r\n");
      out.write("|---------------------------------------------------------|\r\n");
      out.write("|LAYOUT OPTIONS | fixed                                   |\r\n");
      out.write("|               | layout-boxed                            |\r\n");
      out.write("|               | layout-top-nav                          |\r\n");
      out.write("|               | sidebar-collapse                        |\r\n");
      out.write("|               | sidebar-mini                            |\r\n");
      out.write("|---------------------------------------------------------|\r\n");
      out.write("-->\r\n");
      out.write("<body class=\"hold-transition skin-green sidebar-mini\">\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Main Header -->\r\n");
      out.write("        <header class=\"main-header\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Logo -->\r\n");
      out.write("            <a href=\"index.jsp\" class=\"logo\">\r\n");
      out.write("                <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("                <span class=\"logo-mini\"><b>S</b>P</span>\r\n");
      out.write("                <!-- logo for regular state and mobile devices -->\r\n");
      out.write("                <span class=\"logo-lg\"><b>Service</b>Provider</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <!-- Header Navbar -->\r\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("                <!-- Sidebar toggle button-->\r\n");
      out.write("                <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <!-- Navbar Right Menu -->\r\n");
      out.write("                <div class=\"navbar-custom-menu\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <!-- Messages: style can be found in dropdown.less-->\r\n");
      out.write("                        <li class=\"dropdown messages-menu\">\r\n");
      out.write("                            <!-- Menu toggle button -->\r\n");
      out.write("\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <!-- inner menu: contains the messages -->\r\n");
      out.write("                                <ul class=\"menu\">\r\n");
      out.write("                                    <li><!-- start message -->\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("                                            <div class=\"pull-left\">\r\n");
      out.write("                                                <!-- User Image -->\r\n");
      out.write("                                                <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <!-- Message title and timestamp -->\r\n");
      out.write("                                            <h4>\r\n");
      out.write("                                                Support Team\r\n");
      out.write("                                                <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\r\n");
      out.write("                                            </h4>\r\n");
      out.write("                                            <!-- The message -->\r\n");
      out.write("                                            <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <!-- end message -->\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <!-- /.menu -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- /.messages-menu -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Notifications Menu -->\r\n");
      out.write("                    <li class=\"dropdown notifications-menu\">\r\n");
      out.write("                        <!-- Menu toggle button -->\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <!-- Inner Menu: contains the notifications -->\r\n");
      out.write("                                <ul class=\"menu\">\r\n");
      out.write("                                    <li><!-- start notification -->\r\n");
      out.write("\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <!-- end notification -->\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- Notifications Menu -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Tasks Menu -->\r\n");
      out.write("                    <li class=\"dropdown tasks-menu\">\r\n");
      out.write("                        <!-- Menu Toggle Button -->\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <!-- Inner menu: contains the tasks -->\r\n");
      out.write("                                <ul class=\"menu\">\r\n");
      out.write("\r\n");
      out.write("                                    <!-- end task item -->\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"footer\">\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- User Account Menu -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Control Sidebar Toggle Button -->\r\n");
      out.write("                    <li>\r\n");
      out.write("                        ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                   \r\n");
      out.write("                    <li>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                   \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("        <aside class=\"main-sidebar\">\r\n");
      out.write("\r\n");
      out.write("            <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("            <section class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar user panel (optional) -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"sidebar-menu\">\r\n");
      out.write("                    <li class=\"header\">Main Navigation</li>\r\n");
      out.write("                    <!-- Optionally, you can add icons to the links -->\r\n");
      out.write("                    <!--Dashboard-->\r\n");
      out.write("                    <li class=\"treeview\">\r\n");
      out.write("                        <a href=\"index.jsp\"><i class=\"fa fa-dashboard\"></i> <span>Dashboard</span> </a>\r\n");
      out.write("                        <!-- Dashboard -->\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- Sidebar Menu -->\r\n");
      out.write("                <ul class=\"sidebar-menu\">\r\n");
      out.write("                    <li class=\"header\">Service Management</li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"treeview\">\r\n");
      out.write("                    <li><a href=\"Services.jsp\"><i class=\"fa fa-car\"></i>Services</a></li>\r\n");
      out.write("                    <li><a href=\"AddServices.jsp\"><i class=\"fa fa-book\"></i>Add Services</a></li>\r\n");
      out.write("                    <li><a href=\"PenReq.jsp\"><i class=\"fa fa-clock-o\"></i>Pending Requests</a></li>\r\n");
      out.write("                    <li><a href=\"Arrangement.jsp\"><i class=\"fa fa-dollar\"></i>Arrangements</a></li>\r\n");
      out.write("                    <li><a href=\"TransHis.jsp\"><i class=\"fa fa-dollar\"></i>Transactions</a></li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"sidebar-menu\">\r\n");
      out.write("                    <li class=\"header\">Others</li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"treeview\">\r\n");
      out.write("                    <li><a href=\"profile.jsp\"><i class=\"fa fa-pencil\"></i>Account Settings</a></li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <a href=\"logout\" data-toggle=\"control-sidebar\"><i class=\"fa fa-user\"></i> Logout</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- /.sidebar-menu -->\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- /.sidebar -->\r\n");
      out.write("        </aside>\r\n");
      out.write("\r\n");
      out.write("        <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("        <div class=\"content-wrapper\">\r\n");
      out.write("            <!-- Content Header (Page header) -->\r\n");
      out.write("            <section class=\"content-header\">\r\n");
      out.write("                <!-- REQUIRED JS SCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1 class=\"page-header\">Dashboard</h1>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"PenReq.jsp\">\r\n");
      out.write("                <div class=\"col-md-5 col-sm-6 col-xs-13\">\r\n");
      out.write("                    <div class=\"info-box\">\r\n");
      out.write("                        <span class=\"info-box-icon bg-aqua\"><i class=\"fa fa-clock-o\"></i></span>\r\n");
      out.write("                        <div class=\"info-box-content\">\r\n");
      out.write("                            <span class=\"info-box-text\">Pending Request</span>\r\n");
      out.write("                            ");
      if (_jspx_meth_sql_setDataSource_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_sql_query_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <span class=\"info-box-number\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows[0].requestsCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.info-box-content -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.info-box -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"TransHis.jsp\">\r\n");
      out.write("                <div class=\"col-md-5 col-sm-6 col-xs-12\">\r\n");
      out.write("                    <div class=\"info-box\">\r\n");
      out.write("                        <span class=\"info-box-icon bg-green\"><i class=\"fa fa-dollar\"></i></span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"info-box-content\">\r\n");
      out.write("                            <span class=\"info-box-text\">Transaction History</span>\r\n");
      out.write("                            ");
      if (_jspx_meth_sql_query_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <span class=\"info-box-number\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows[0].invoice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.info-box-content -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.info-box -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box box-info\">\r\n");
      out.write("            <div class=\"box-header with-border\">\r\n");
      out.write("                <h3 class=\"box-title\">Calendar</h3>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"box-tools pull-right\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"remove\"><i class=\"fa fa-times\"></i></button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-header -->\r\n");
      out.write("            <div class=\"box-body\">\r\n");
      out.write("                <div id='calendar'></div>\r\n");
      out.write("                <!-- /.table-responsive -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-body -->\r\n");
      out.write("            <!--            <div class=\"box-footer clearfix\">\r\n");
      out.write("                            <a href=\"/admin/event/list\" class=\"btn btn-sm btn-info btn-flat pull-right\">View All Events</a>\r\n");
      out.write("                        </div>-->\r\n");
      out.write("            <!-- /.box-footer -->\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      if (_jspx_meth_sql_query_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("            window.addEventListener('DOMContentLoaded', function () {\r\n");
      out.write("                (function ($) {\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        $('#calendar').fullCalendar({\r\n");
      out.write("                            header: {\r\n");
      out.write("                                left: 'prev,next today',\r\n");
      out.write("                                center: 'title',\r\n");
      out.write("                                right: 'month,basicWeek,basicDay,listYear,listWeek'\r\n");
      out.write("                            },\r\n");
      out.write("                            defaultDate: '2017-05-12',\r\n");
      out.write("                            navLinks: true, // can click day/week names to navigate views\r\n");
      out.write("                            editable: false,\r\n");
      out.write("                            eventLimit: true, // allow \"more\" link when too many events\r\n");
      out.write("                            events: [\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            ]\r\n");
      out.write("\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("                )(jQuery);\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src='fullcalendar/lib/moment.min.js'></script>\r\n");
      out.write("        <script src=\"fullcalendar/lib/jquery.min.js\"></script>\r\n");
      out.write("        <script src='fullcalendar/fullcalendar.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- Main content -->\r\n");
      out.write("<section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Your Page Content Here -->\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("<!-- /.content -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- Main Footer -->\r\n");
      out.write("<footer class=\"main-footer\">\r\n");
      out.write("    <!-- To the right -->\r\n");
      out.write("    <div class=\"pull-right hidden-xs\">\r\n");
      out.write("        Anything you want\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Default to the left -->\r\n");
      out.write("    <strong>Copyright &copy; 2016 <a href=\"#\">Company</a>.</strong> All rights reserved.\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<!-- Control Sidebar -->\r\n");
      out.write("<aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Create the tabs -->\r\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\r\n");
      out.write("        <li class=\"active\"><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\r\n");
      out.write("        <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- Tab panes -->\r\n");
      out.write("    <div class=\"tab-content\">\r\n");
      out.write("        <!-- Home tab content -->\r\n");
      out.write("        <div class=\"tab-pane active\" id=\"control-sidebar-home-tab\">\r\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Recent Activity</h3>\r\n");
      out.write("            <ul class=\"control-sidebar-menu\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"javascript:;\">\r\n");
      out.write("                        <i class=\"menu-icon fa fa-birthday-cake bg-red\"></i>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"menu-info\">\r\n");
      out.write("                            <h4 class=\"control-sidebar-subheading\">Langdon's Birthday</h4>\r\n");
      out.write("\r\n");
      out.write("                            <p>Will be 23 on April 24th</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Tasks Progress</h3>\r\n");
      out.write("            <ul class=\"control-sidebar-menu\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"javascript:;\">\r\n");
      out.write("                        <h4 class=\"control-sidebar-subheading\">\r\n");
      out.write("                            Custom Template Design\r\n");
      out.write("                            <span class=\"pull-right-container\">\r\n");
      out.write("                                <span class=\"label label-danger pull-right\">70%</span>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </h4>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"progress progress-xxs\">\r\n");
      out.write("                            <div class=\"progress-bar progress-bar-danger\" style=\"width: 70%\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.tab-pane -->\r\n");
      out.write("        <!-- Stats tab content -->\r\n");
      out.write("        <div class=\"tab-pane\" id=\"control-sidebar-stats-tab\">Stats Tab Content</div>\r\n");
      out.write("        <!-- /.tab-pane -->\r\n");
      out.write("        <!-- Settings tab content -->\r\n");
      out.write("        <div class=\"tab-pane\" id=\"control-sidebar-settings-tab\">\r\n");
      out.write("            <form method=\"post\">\r\n");
      out.write("                <h3 class=\"control-sidebar-heading\">General Settings</h3>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"control-sidebar-subheading\">\r\n");
      out.write("                        Report panel usage\r\n");
      out.write("                        <input type=\"checkbox\" class=\"pull-right\" checked>\r\n");
      out.write("                    </label>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Some information about this general settings option\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.form-group -->\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.tab-pane -->\r\n");
      out.write("    </div>\r\n");
      out.write("</aside>\r\n");
      out.write("<!-- /.control-sidebar -->\r\n");
      out.write("<!-- Add the sidebar's background. This div must be placed\r\n");
      out.write("     immediately after the control sidebar -->\r\n");
      out.write("<div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Optionally, you can add Slimscroll and FastClick plugins.\r\n");
      out.write("     Both of these plugins are recommended to enhance the\r\n");
      out.write("     user experience. Slimscroll is required when using the\r\n");
      out.write("     fixed layout. -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Control Sidebar -->\r\n");
      out.write("<aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Create the tabs -->\r\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\r\n");
      out.write("        <li class=\"active\"><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\r\n");
      out.write("        <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- Tab panes -->\r\n");
      out.write("    <div class=\"tab-content\">\r\n");
      out.write("        <!-- Home tab content -->\r\n");
      out.write("        <div class=\"tab-pane active\" id=\"control-sidebar-home-tab\">\r\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Recent Activity</h3>\r\n");
      out.write("            <ul class=\"control-sidebar-menu\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"javascript:;\">\r\n");
      out.write("                        <i class=\"menu-icon fa fa-birthday-cake bg-red\"></i>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"menu-info\">\r\n");
      out.write("                            <h4 class=\"control-sidebar-subheading\">Langdon's Birthday</h4>\r\n");
      out.write("\r\n");
      out.write("                            <p>Will be 23 on April 24th</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Tasks Progress</h3>\r\n");
      out.write("            <ul class=\"control-sidebar-menu\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"javascript:;\">\r\n");
      out.write("                        <h4 class=\"control-sidebar-subheading\">\r\n");
      out.write("                            Custom Template Design\r\n");
      out.write("                            <span class=\"pull-right-container\">\r\n");
      out.write("                                <span class=\"label label-danger pull-right\">70%</span>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </h4>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"progress progress-xxs\">\r\n");
      out.write("                            <div class=\"progress-bar progress-bar-danger\" style=\"width: 70%\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.tab-pane -->\r\n");
      out.write("        <!-- Stats tab content -->\r\n");
      out.write("        <div class=\"tab-pane\" id=\"control-sidebar-stats-tab\">Stats Tab Content</div>\r\n");
      out.write("        <!-- /.tab-pane -->\r\n");
      out.write("        <!-- Settings tab content -->\r\n");
      out.write("        <div class=\"tab-pane\" id=\"control-sidebar-settings-tab\">\r\n");
      out.write("            <form method=\"post\">\r\n");
      out.write("                <h3 class=\"control-sidebar-heading\">General Settings</h3>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"control-sidebar-subheading\">\r\n");
      out.write("                        Report panel usage\r\n");
      out.write("                        <input type=\"checkbox\" class=\"pull-right\" checked>\r\n");
      out.write("                    </label>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Some information about this general settings option\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.form-group -->\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.tab-pane -->\r\n");
      out.write("    </div>\r\n");
      out.write("</aside>\r\n");
      out.write("<!-- /.control-sidebar -->\r\n");
      out.write("<!-- Add the sidebar's background. This div must be placed\r\n");
      out.write("     immediately after the control sidebar -->\r\n");
      out.write("<div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- REQUIRED JS SCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 2.2.3 -->\r\n");
      out.write("<script src=\"plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.6 -->\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"DataTables/datatables.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"DataTables/datatables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(\"#data-table\").dataTable({\r\n");
      out.write("            dom: 'Bfrtip',\r\n");
      out.write("            buttons: [\r\n");
      out.write("                'colvis',\r\n");
      out.write("                'excel',\r\n");
      out.write("                'csv'\r\n");
      out.write("            ],\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write(" <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $('input').iCheck({\r\n");
      out.write("                    checkboxClass: 'icheckbox_square-blue',\r\n");
      out.write("                    radioClass: 'iradio_square-blue',\r\n");
      out.write("                increaseArea: '20%' // optional\r\n");
      out.write("            });\r\n");
      out.write("                $(\"form\").validate({\r\n");
      out.write("                 rules: {\r\n");
      out.write("                    service_name: \"required\",\r\n");
      out.write("                    description: \"required\",\r\n");
      out.write("                    price: {\r\n");
      out.write("                        required: true,\r\n");
      out.write("                        minlength: 6,\r\n");
      out.write("                        $('#price')\r\n");
      out.write("                                .formValidation('number','integer')\r\n");
      out.write("                    },\r\n");
      out.write("                    messages: {\r\n");
      out.write("                        sevice_name: \"Please enter your name\",\r\n");
      out.write("                        description: \"Please enter your decription\",\r\n");
      out.write("                        price: \"Please enter price as a number\"\r\n");
      out.write("                    }\r\n");
      out.write("                 }\r\n");
      out.write("    // Specify validation error messages\r\n");
      out.write("\r\n");
      out.write("    // Make sure the form is submitted to the destination defined\r\n");
      out.write("    // in the \"action\" attribute of the form when valid\r\n");
      out.write("    submitHandler: function(form) {\r\n");
      out.write("      form.submit();\r\n");
      out.write("  }\r\n");
      out.write("});\r\n");
      out.write("                \r\n");
      out.write("            });\r\n");
      out.write("            $(\"#AddServices\").validate();\r\n");
      out.write("        </script>\r\n");
      out.write("<!-- Optionally, you can add Slimscroll and FastClick plugins.\r\n");
      out.write("     Both of these plugins are recommended to enhance the\r\n");
      out.write("     user experience. Slimscroll is required when using the\r\n");
      out.write("     fixed layout. -->\r\n");
      out.write(" \r\n");
      out.write("        <script src='fullcalendar/lib/moment.min.js'></script>\r\n");
      out.write("        <script src='fullcalendar/lib/jquery.min.js'></script>\r\n");
      out.write("        <script src='fullcalendar/fullcalendar.min.js'></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("snapshot");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost/webtek-database-finals");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snapshot}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setVar("result");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("                            SELECT CONCAT(fname, \" \",lname) name\r\n");
          out.write("                            FROM `service provider`\r\n");
          out.write("                            WHERE `service provider`.username = ?;\r\n");
          out.write("                            ");
          if (_jspx_meth_sql_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_0, _jspx_page_context, _jspx_push_body_count_sql_query_0))
            return true;
          out.write("\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_0 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_0);
    _jspx_th_sql_param_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_0 = _jspx_th_sql_param_0.doStartTag();
    if (_jspx_th_sql_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <a data-toggle=\"control-sidebar\"><i class=\"fa fa-user\"></i> ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</a>\r\n");
          out.write("\r\n");
          out.write("                            <style>\r\n");
          out.write("                                p.page-header {\r\n");
          out.write("                                    color: whitesmoke;\r\n");
          out.write("                                }\r\n");
          out.write("                            </style>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_1 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_1.setParent(null);
    _jspx_th_sql_setDataSource_1.setVar("snapshot");
    _jspx_th_sql_setDataSource_1.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_1.setUrl("jdbc:mysql://localhost/webtek-database-finals");
    _jspx_th_sql_setDataSource_1.setUser("root");
    _jspx_th_sql_setDataSource_1.setPassword("");
    int _jspx_eval_sql_setDataSource_1 = _jspx_th_sql_setDataSource_1.doStartTag();
    if (_jspx_th_sql_setDataSource_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_1);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent(null);
    _jspx_th_sql_query_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snapshot}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_1.setVar("result");
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("                                SELECT COUNT(*) as 'requestsCount' from requests inner join `service provider` \r\n");
          out.write("                                on `service provider`.sp_id = requests.sp_id WHERE status = 'Pending' and username = ?;\r\n");
          out.write("                                ");
          if (_jspx_meth_sql_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_1, _jspx_page_context, _jspx_push_body_count_sql_query_1))
            return true;
          out.write("\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_1 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_1);
    _jspx_th_sql_param_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_1 = _jspx_th_sql_param_1.doStartTag();
    if (_jspx_th_sql_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent(null);
    _jspx_th_sql_query_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snapshot}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_2.setVar("result");
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("                                SELECT COUNT(*) as 'invoice' from invoice \r\n");
          out.write("                                INNER JOIN `service provider` on `service provider`.sp_id = invoice.sp_id \r\n");
          out.write("                                WHERE username = ?;\r\n");
          out.write("                            ");
          if (_jspx_meth_sql_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_2, _jspx_page_context, _jspx_push_body_count_sql_query_2))
            return true;
          out.write("\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_2 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_2);
    _jspx_th_sql_param_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_2 = _jspx_th_sql_param_2.doStartTag();
    if (_jspx_th_sql_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
    return false;
  }

  private boolean _jspx_meth_sql_query_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent(null);
    _jspx_th_sql_query_3.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snapshot}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_3.setVar("result");
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_3[0]++;
          _jspx_th_sql_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_3.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            SELECT targetDate as 'Date',  service_name as 'Service' \r\n");
          out.write("            FROM arrangement \r\n");
          out.write("            INNER JOIn `service provider` on `service provider`.`sp_id` = arrangement.sp_id \r\n");
          out.write("            INNER JOIN services on services.service_id = arrangement.service_id \r\n");
          out.write("            WHERE username = ?\r\n");
          out.write("            ORDER BY DATE;\r\n");
          out.write("            ");
          if (_jspx_meth_sql_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_3, _jspx_page_context, _jspx_push_body_count_sql_query_3))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_3[0]--;
      }
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_3 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_3);
    _jspx_th_sql_param_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_3 = _jspx_th_sql_param_3.doStartTag();
    if (_jspx_th_sql_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_3);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("row");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                {\r\n");
          out.write("\r\n");
          out.write("                                    title: '");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("',\r\n");
          out.write("                                    start: '");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("'\r\n");
          out.write("                                },\r\n");
          out.write("\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.Service}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.Date}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }
}
