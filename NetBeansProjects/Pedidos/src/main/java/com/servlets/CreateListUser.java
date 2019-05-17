/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.Dao.UsuarioDao;
import com.models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Helen Garcia
 */
public class CreateListUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       /**
        * sendRedirect me redirecciona a la url de
        * otro servlet
        * @getParameter recupera un parámetro de la request, devuelve un String con el valor del parámetro o null en caso de que no exista 
        * @setAttribute sirve para cambair el valor de un atributo
        * Equals se usa para saber si dos objetos son del mismo tipo y tienen los mismos datos. Nos dara el valor true si son iguales y false si no.
        */
    
       

        HttpSession session = request.getSession();

        String user = request.getParameter("name");
        String pas = request.getParameter("pass");

        Usuario name;
        try {
            name = UsuarioDao.getUsuario(user);

            if (name != null) {
                if (pas.equals(name.getPassword())) {
                    response.sendRedirect("search.jsp");
                    session.setAttribute("id", name.getId());
                    session.setAttribute("IS_AUTHETICATED", true);
                }

            } else {
                response.sendRedirect("loginInvalido.jsp");
                System.out.println("no funciona");

            }
        } catch (Exception e) {

        }
    }

    /**
     *
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
