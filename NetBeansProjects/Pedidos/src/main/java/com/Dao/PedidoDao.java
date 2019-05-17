/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dao;

import com.conexion.Conexion;
import com.models.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Se declaran todos los métodos que deseamos ocupar y asi poder implementar lo
 * que queremos a la base de datos
 * @author Hlen Garcia
 * @version 1.0
 */
public class PedidoDao {

    /**
     * @param metodo connection preparedStatement se utiliza para crear un
     * objeto y para pasar valores a los parámetros de entrada
     * @param pedido id, cantidad, idCliente, idProducto
     * @return pedido ingresado
     */

    public static boolean add(Pedido pedido) {
        Connection con = null;
        PreparedStatement ps;
        String sql = "insert into pedido values( null, ?, ?, ?, ? )";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pedido.getCantidad());
            ps.setInt(2, pedido.getUsuario_id());
            ps.setInt(3, pedido.getCliente_id());
            ps.setInt(4, pedido.getProducto_id());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("error al insertar pedido: " + e);
            return false;
        }
    }
    /**
     *@param PreparedStatement.executeQuery metodo por el cual obtenemos los
     * datos de la BD y el objeto ResulSet devuelve los datos de columna que
     * corresponden a una fila
     * @param metodo add que nos perimite añadir definición de un conjunto de
     * variables agrupadas todas bajo un mismo nombre 
     * @return  lista de pedidos ingresados
     */

    public static List<Pedido> getAll() {
        List<Pedido> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select  c.name,  p.name, p.codigo, p.marca, pe.cantidad, u.user_name"
                + " from cliente c, pedido pe, producto p, usuario u "
                + " where pe.cliente_id = c.id "
                + " and pe.producto_id = p.id"
                + " and pe.usuario_id = u.id";
        

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Pedido(
                        rs.getString("pe.cantidad"),
                        rs.getString("c.name"),
                        rs.getString("p.name"),
                         rs.getString("p.codigo"),
                        rs.getString("p.marca"),
                        rs.getString("u.user_name")           
              
                ));
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("error al mostrar lista pedido " + e);
            list.clear();
        }

        return list;
    }
}
