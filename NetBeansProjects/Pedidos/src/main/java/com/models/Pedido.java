/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *@version 1.0
 * @author Helen Garcia
 * clase donde se declaran los atributos constructor, getters y setters del
 * objeto pedido
 * 
 */
public class Pedido {
    

    private int id;
    private String cantidad;
    private int cliente_id;
    private String clienteName;
    private int producto_id;
    private String productoName;
    private String codigo;
    private String marca;
    private int usuario_id;
    private String usuarioName;
    /**
     * @metodo constructor de pedido
     * @param usuario_id contien el nombre de cada usuario
     * @param cliente_id contiene el nombre  de cada cliente
     * @param producto_id contiene el nombre de cada producto
     * @param cantidad  contiente la cantidad de productos
     */

    public Pedido(int usuario_id, int cliente_id, int producto_id, String cantidad) {
        this.cantidad = cantidad;
        this.cliente_id = cliente_id;
        this.usuario_id = usuario_id;
        this.producto_id = producto_id;
    }

    /**
     * 
     * @param cantidad de productos
     * @param clienteName nombre del cliente para pedido
     * @param productoName nombre de producto para pedido
     * @param marca nombre de marcas para pedido
     * @param codigo codigos de cada producto
     * @param usuarioName  nombre de usuario que realiza pedido
     */
    public Pedido(String cantidad, String clienteName, String productoName, String marca, String codigo, String usuarioName) {
        this.cantidad = cantidad;
        this.clienteName = clienteName;
        this.productoName = productoName;
        this.codigo = codigo;
        this.marca = marca;
        this.usuarioName = usuarioName;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getClienteName() {
        return clienteName;
    }

    public void setClienteName(String clienteName) {
        this.clienteName = clienteName;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getProductoName() {
        return productoName;
    }

    public void setProductoName(String productoName) {
        this.productoName = productoName;
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

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuarioName() {
        return usuarioName;
    }

    public void setUsuarioName(String usuarioName) {
        this.usuarioName = usuarioName;
    }

}
