/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author helen
 */
public class Conexion {

    private static Connection con;
    private static String stringConexion;
    private static boolean conectado = false;

    public static Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            stringConexion = "jdbc:mysql://localhost:3306/orders?useSSL=false&allowPublicKeyRetrival=true";
            con = DriverManager.getConnection(stringConexion, "root", "12345");
            conectado = true;
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }
    }

    public static void close() throws SQLException {
        if (conectado = true) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("no se pudo cerrar");
            }

        }
    }

}
