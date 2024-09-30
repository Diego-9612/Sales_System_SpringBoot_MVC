package com.diegoguerrero.sistema.ventas.sales_system_springboot_shopmaster.Entidades;

import java.util.Set;

public class Venta {

    private Integer id;
    private String fechaYHora;

    private Set<ProductoVendido> productos;

    public Venta() {
        this.fechaYHora = Utiles.obtenerFechaYHoraActual();

    }

    public float getTotal() {
        Float total = 0f;
        for (ProductoVendido productovendido : this.productos) {
            total += productovendido.getTotal();
        }
        return total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(String fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Set<ProductoVendido> getProductos() {
        return productos;
    }

    public void setProductos(Set<ProductoVendido> productos) {
        this.productos = productos;
    }

}
