/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.models.Pedido;
import com.models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author helen
 */
public class CreatePedido extends HttpServlet {

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
    /**
     * HttpSession Proporciona una forma de identificar a un usuario en más de
     * una solicitud de página o visita a un sitio web y almacenar información
     * sobre ese usuario El método valueOf() retorna el valor primitivo del
     * objeto especificado.
     * @Integer es un puntero que hace referencia a una clase que contiene un
     * entero
     * @parseInt convierte un string y devuelbe un entero
     * @sendRedirect redirige la petición a otro servlet
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession login = request.getSession();

        String user = (String.valueOf(login.getAttribute("id")));
        int id = Integer.parseInt(user);
        int clienten = Integer.parseInt(request.getParameter("cliente"));
        int a = Integer.parseInt(request.getParameter("producto"));
        String cantidad = request.getParameter("cantidad");
        Pedido pedido = new Pedido(id, clienten, a, cantidad);

        com.Dao.PedidoDao.add(pedido);

        response.sendRedirect("CreateListPedido");
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
