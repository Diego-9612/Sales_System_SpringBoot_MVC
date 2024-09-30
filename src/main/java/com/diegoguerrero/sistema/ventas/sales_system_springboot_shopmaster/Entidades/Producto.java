package com.diegoguerrero.sistema.ventas.sales_system_springboot_shopmaster.Entidades;

public class Producto {

    private Integer idProducto;
    
    private String nombreProducto;
    
    private String codigo;
    
    private float precio;
    
    private float existencia;

    public Producto(Integer idProducto, String nombreProducto, String codigo, float precio, float existencia) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.precio = precio;
        this.existencia = existencia;
    }

    public Producto(String nombreProducto, String codigo, float precio, float existencia) {
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.precio = precio;
        this.existencia = existencia;
    }

    public Producto() {
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getExistencia() {
        return existencia;
    }

    public void setExistencia(float existencia) {
        this.existencia = existencia;
    }

    public boolean sinExistencia() {
        return this.existencia <= 0;
    }

    public void restarExistencia(Float existencia) {
        this.existencia -= existencia;
    }

    

}
