/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba;

import com.Dao.ProductoDao;
import com.models.Producto;
import java.sql.SQLException;

/**
 *
 * @author helen
 */
public class PruebaProducto {
    public static void main(String [] args) throws SQLException{
        
        Producto name = new Producto("124466","crema care", "Avon");
       
        if(ProductoDao.add(name)){
            System.out.println("Query Ok");            
        }else{
            System.out.println("no se puedo insertar");
        }   
    }
    
}
