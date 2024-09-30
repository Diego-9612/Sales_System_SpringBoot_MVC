package com.diegoguerrero.sistema.ventas.sales_system_springboot_shopmaster.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.diegoguerrero.sistema.ventas.sales_system_springboot_shopmaster.Entidades.Producto;

public interface ProductosRepository extends CrudRepository <Producto, Integer> {

}
