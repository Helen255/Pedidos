/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 * clase donde se declaran los atributos constructor, getters y setters del
 * objeto clinte
 *
 * @author Helen Garcia
 * @version 1.0
 */
public class Cliente {

    private int id;
    private String name;

    /**
     * @metodo constructor de cliente
     * @param id contiene el id de cada cliente
     * @param name contiene el nombre
     */
    public Cliente(int id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * 
     * @param name  contiene el nombre
     */

    public Cliente(String name) {
        this.name = name;
    }

    /**
     * metodo que obtiene el id
     *
     * @return id de cada cliente ingresado
     */
    public int getId() {
        return id;
    }

    /**
     * metodo que asigna un id a cada cliente
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * metodo que obtiene el nombre
     *
     * @return el nombre de cada cliente
     */
    public String getName() {
        return name;
    }

    /**
     * metodo que asigna un nombre a cliente
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
