/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba;

import com.Dao.UsuarioDao;
import com.models.Usuario;
import java.sql.SQLException;

/**
 *
 * @author helen
 */
public class PruebaUsuario {
     public static void main(String [] args) throws SQLException{
        
        Usuario user = new Usuario("Leo", "1234567?");
       
        if(UsuarioDao.add(user)){
            System.out.println("Query Ok");            
        }else{
            System.out.println("no se puedo insertar");
        }   
    }
    
}
