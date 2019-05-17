/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 * clase donde se declaran los atributos constructor,getters y setters del
 * objeto usuario
 * @author helen
 * @version 1.0
 */
public class Usuario {

    /**
     * se declaran objetos que ocupara el usuario
     */
    private int id;
    private String user_name;
    private String password;

    /**
     * @metodo constructor de usuario
     * @param id contiene el id de cada usuario
     * @param user_name contiene elnombre
     * @param password contiene la contraseña
     */
    public Usuario(int id, String user_name, String password) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;

    }

    /**
     * metodo constructor de usuario
     *
     * @param user_name contiene el nombre agregado a cada usuario
     * @param password contiene la contraseña de cada usuario
     */

    public Usuario(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;

    }

    /**
     * metodo que obtiene el id 
     *
     * @return id de cada usuario ingresado
     */
    public int getId() {
        return id;
    }

    /**
     * metodo que asigna un id a cada usuario
     *
     * @param id 
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * metodo que obtiene el nombre 
     *
     * @return el nombre de cada usuario
     */

    public String getUser_name() {
        return user_name;
    }

    /**
     * metodo que asigna un nombre a usuario
     *
     * @param user_name 
     */

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * metodo que obtiene la contraseña 
     *
     * @return la contraseña de cada usuario
     */

    public String getPassword() {
        return password;
    }

    /**
     *metodo que asigna una contraseña a usuario
     *
     * @param password
     */

    public void setPassword(String password) {
        this.password = password;
    }

}
