/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.models.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author helen
 */
public class AddPedido extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request solicitud de informacion de datos a un
     * servidor
     * @param response servlet request sirve para presentar en la pantalla del
     * navegador del cliente el resultado de cualquier código que hayamos
     * escrito
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /**
         * @Integer es un puntero que hace referencia a una clase que contiene
         * un entero
         * @parseInt convierte un string y devuelbe un entero
         * @setAttribute sirve para cambair el valor de un atributo
         * @forward la url que se puede ver del primer srvlet en el navegador
         * @getRequestDispatcher.forward(request, response) reenvia la solicitud
         */
        int cliente_id = Integer.parseInt(request.getParameter("cli"));

        String clienteName = request.getParameter("clienteName");

        request.setAttribute("clie", cliente_id);
        request.setAttribute("clienteName", clienteName);
        request.getRequestDispatcher("addOrders.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet. datos del cliente
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
