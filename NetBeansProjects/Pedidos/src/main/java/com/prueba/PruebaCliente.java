/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba;

import com.Dao.ClienteDao;
import com.models.Cliente;
import java.sql.SQLException;

/**
 *
 * @author Helen Garcia
 */
public class PruebaCliente {
      public static void main(String [] args) throws SQLException{
          
        
        Cliente name = new Cliente("Graciela");
       
        if(ClienteDao.add(name)){
            System.out.println("Query Ok");            
        }else{
            System.out.println("no se puedo insertar");
        }   
    }
    
}
