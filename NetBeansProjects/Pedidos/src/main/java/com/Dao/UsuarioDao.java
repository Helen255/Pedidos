/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dao;

import com.conexion.Conexion;
import com.models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Se declaran todos los métodos que deseamos ocupar y asi poder implementar lo
 * que queramos a la base de datos.
 *
 * @version 1.0
 * @author Helen Garcia
 */
public class UsuarioDao {

    /**
     * @param metodo connection preparedStatement se utiliza para crear un
     * objeto y para pasar valores a los parámetros de entrada
     *
     * @param usuario id, nombre de usuario, contraseña
     * @return los usuarios ingresados
     */

    /*aqui se inicializan los objetos usuario para poder insertarlos*/
    public static boolean add(Usuario usuario) {
        Connection con = null;
        PreparedStatement ps;
        String sql = "insert into usuario values( null, ?, ? )";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUser_name());
            ps.setString(2, usuario.getPassword());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("error al insertar usuario: " + e);
            return false;
        }
    }

    /**
     * @param PreparedStatement.executeQuery metodo por el cual obtenemos los
     * datos de la BD y el objeto ResulSet devuelve los datos de columna que
     * corresponden a una fila
     * @param metodo add que nos perimite añadir definicion de un conjunto de
     * variables agrupadas todas bajo un mismo nombre
     * @return lista de usuarios ingresados
     */

    /*aqui  mostrara la lista de los usuarios ya ingresados*/
    public static List<Usuario> getAll() {
        List<Usuario> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select id, user_name, password * from usuario";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Usuario(
                        rs.getInt("id"),
                        rs.getString("user_name"),
                        rs.getString("password")
                ));
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("error al mostrar lista usuario: " + e);
            list.clear();
        }

        return list;
    }
    
    /**
     * 
     * @param usuario id, nombre, contraseña
     * @return usuarios registrados
     * @throws SQLException 
     * objeto PreParedStatement Se utiliza para enviar sentencias SQL pre compiladas con uno o más parámetros.
     *  objeto ResulSet devuelve los datos de columna que
     * corresponden a una fila
     */
    /*autenticacion de usuaro*/
      public static Usuario getUsuario(String usuario) throws SQLException{
    String sql="select id, user_name, password FROM usuario WHERE user_name = '"+usuario+"'";
    
    try{
        Connection con= Conexion.getConexion();
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        rs.first();
            Usuario usual;
            usual= new Usuario(
                    rs.getInt("id"),
                    rs.getString("user_name"),
                    rs.getString("password")
                   
            );
            return usual;
            
    }catch(SQLException e){
        System.out.println("error usuario" + e);
        return null;
    }
    }

}
