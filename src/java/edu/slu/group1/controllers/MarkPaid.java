/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.slu.group1.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mark
 */
@WebServlet(name = "MarkPaid", urlPatterns = {"/mark"})
public class MarkPaid extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        try {
            String arrangement_id = (String) request.getParameter("arrangement_id");
            out.append(arrangement_id);

            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO invoice (`cu_id`, `sp_id`, `service_id`, `date`, `total_amount`) SELECT `cu_id`, `arrangement`.`sp_id`, `arrangement`.`service_id`, `targetDate`, `services`.`price` FROM arrangement INNER JOIN services ON services.service_id = arrangement.service_id WHERE arrangement_id =" + arrangement_id;
            stmt.executeUpdate(sql);
            sql = "UPDATE arrangement SET payment_type = 'Meet-up' WHERE arrangement_id =" + arrangement_id;
            stmt.executeUpdate(sql);
//            out.print("@approve" + req_id);
            request.setAttribute("message", "Transaction done and paid!");
            request.getRequestDispatcher("Arrangement.jsp").forward(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(ApproveRequest.class.getName()).log(Level.SEVERE, null, ex);
            out.print("test!!");

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
