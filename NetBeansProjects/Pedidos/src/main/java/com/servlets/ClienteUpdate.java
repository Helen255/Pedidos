/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.models.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author helen
 */
public class ClienteUpdate extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request solicitud de informacion de datos a un
     * servidor
     * @param response servlet response sirve para presentar en la pantalla del
     * navegador del cliente el resultado de cualquier código que hayamos
     * escrito
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /**
         * @Integer es un puntero que hace referencia a una clase que contiene
         * un entero
         * @parseInt convierte un string y devuelbe un entero
         * @sendRedirect redirige la petición a otro servlet
         * @getParameter recupera un parámetro de la request. Devuelve un String con el valor del parámetro o null en caso de que no exista 
         */
        Cliente cos;
        int id = Integer.parseInt(request.getParameter("id"));
        String nom = request.getParameter("nom");

        cos = new Cliente(id, nom);

        com.Dao.ClienteDao.update(cos);

        response.sendRedirect("ClienteById?id=" + id);
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
