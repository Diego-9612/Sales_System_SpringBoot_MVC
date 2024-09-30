package com.diegoguerrero.sistema.ventas.sales_system_springboot_shopmaster.Entidades;

public class ProductosParaVender extends Producto {

    private float cantidad;

    public ProductosParaVender(Integer idProducto, String nombreProducto, String codigo, float precio, float existencia,
            float cantidad) {
        super(idProducto, nombreProducto, codigo, precio, existencia);
        this.cantidad = cantidad;
    }

    public ProductosParaVender(String nombreProducto, String codigo, float precio, float existencia, float cantidad) {
        super(nombreProducto, codigo, precio, existencia);
        this.cantidad = cantidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void aumentarCantidad(){
        this.cantidad++;
    }

    public float getTotal(){
        return this.getPrecio() * this.cantidad;
    }

    


    



}
