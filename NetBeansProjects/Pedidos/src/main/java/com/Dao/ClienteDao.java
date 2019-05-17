/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dao;

import com.conexion.Conexion;
import com.models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Se declaran todos los métodos que deseamos ocupar y asi poder implementar lo
 * que queremos a la base de datos
 *
 * @author Helen Garcia
 * @version 1.0
 */
public class ClienteDao {

    /**
     * @param metodo connection preparedStatement se utiliza para crear un
     * objeto y para pasar valores a los parámetros de entrada
     * @param cliente id, nombre de cliente
     * @return un cliente ingresado
     */
    public static boolean add(Cliente cliente) {
        Connection con = null;
        PreparedStatement ps;
        String sql = "insert into cliente values( null, ? )";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getName());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("error al insertar cliente: " + e);
            return false;
        }
    }

    /**
     * @param PreparedStatement.executeQuery metodo por el cual obtenemos los
     * datos de la BD y el objeto ResulSet devuelve los datos de columna que
     * corresponden a una fila
     * @param metodo add que nos perimite añadir definición de un conjunto de
     * variables agrupadas todas bajo un mismo nombre
     * @return lista de clientes ingresados
     */
    public static List<Cliente> clientList() {
        List<Cliente> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from cliente";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Cliente(
                        rs.getInt("id"),
                        rs.getString("name")
                ));
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("error al mostrar lista cliente: " + e);
            list.clear();
        }

        return list;
    }

    /**
     * @param connection preparedStatement se utiliza para crear un objeto y
     * para pasar valores a los parámetros de entrada metodo executeQuery se
     * utiliza para hacer consulta a la Base de Datos
     * @param id del cliente
     * @return la visualización del cliente
     */

    public static Cliente getById(int id) {
        Cliente cos;
        Connection con;
        PreparedStatement ps;
        String sql = "select * from cliente where id = ?";
        ResultSet rs;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            cos = new Cliente(
                    rs.getInt("id"), rs.getString("name")
            );
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("error al ver cliente:" + e.getMessage());
            cos = null;
        }

        return cos;

    }

    /**
     * @param connection preparedStatement se utiliza para crear un objeto y
     * @para pasar valores a los parámetros de entrada
     * @param rowAffectedExecuteUpdate devuelbe el numero de filas afectadas.
     * @param cliente id, nombre
     * @return Actualizacion del cliente
     */
    public static boolean update(Cliente cliente) {
        Connection con;
        PreparedStatement ps;
        String sql = "update cliente set name  = ? where id = ?";
        int rowAffected;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(2, cliente.getId());
            ps.setString(1, cliente.getName());
            rowAffected = ps.executeUpdate();
            ps.close();
            con.close();
            return rowAffected == 1;
        } catch (SQLException e) {
            System.out.println("error al actualizar:" + e.getMessage());
            return false;
        }
    }
}
