/*,,,,,,,,,,,,,,,,,,,,,,,,,
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dao;

import com.conexion.Conexion;
import com.models.Producto;
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
public class ProductoDao {

    /**
     *
     * @param metodo connection preparedStatement se utiliza para crear un
     * objeto y para pasar valores a los parámetros de entrada
     * @param producto id, nombre del producto
     * @return los productos ingresados
     */
    /*aqui se inicializan los objetos usuario para poder insertarlos*/
    public static boolean add(Producto producto) {
        Connection con = null;
        PreparedStatement ps;
        String sql = "insert into producto values( null, ?,?,? )";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getName());
            ps.setString(2, producto.getCodigo());
            ps.setString(3, producto.getMarca());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("error al insertar producto: " + e);
            return false;
        }
    }

    /**
     * @param PreparedStatement.executeQuery metodo por el cual obtenemos los datos de
     * la Base de Datos y el objeto ResulSet devuelve los datos de columna que corresponden
     * a una fila
     *
     * @param metodo add que nos perimite añadir de definir un conjunto de
     * variables agrupadas todas bajo un mismo nombre
     * @return lista de productos ingresados
     */
    /*aqui  mostrara la lista de los usuarios ya ingresados*/
    public static List<Producto> getProductList() {
        List<Producto> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from producto";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Producto(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("codigo"),
                        rs.getString("marca")
                ));
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("error al mostrar lista prodcuto: " + e);
            list.clear();
        }

        return list;
    }

}
