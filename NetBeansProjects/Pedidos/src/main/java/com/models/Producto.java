/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 * clase donde se declaran los atributos constructor, getters y setters del
 * objeto producto
 *
 * @author Helen Garcia
 * @version 1.0
 */
public class Producto {

    private int id;
    private String name;
    private String codigo;
    private String marca;

    /**
     * metodo constructor de producto
     *
     * @param id contiene el id de cada producto
     * @param name contiene el nombre
     */
    public Producto(int id, String name, String codigo, String marca) {
        this.id = id;
        this.name = name;
        this.codigo = codigo;
        this.marca = marca;
    }
    
      public Producto( String name, String codigo, String marca) {
        this.name= name;
        this.codigo= codigo;
        this.marca= marca;
    }

    /**
     * metodo que obtiene el id
     *
     * @return id de cadametodo producto ingresadp
     */
    public int getId() {
        return id;
    }

    /**
     * metodo que asigna un id a cada producto
     *
     * @param id
     */

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * metodo que obtiene el nombre
     *
     * @return el nombre de cada producto
     */

    
}
