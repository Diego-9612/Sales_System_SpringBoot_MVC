package com.diegoguerrero.sistema.ventas.sales_system_springboot_shopmaster.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.diegoguerrero.sistema.ventas.sales_system_springboot_shopmaster.Entidades.Venta;

public interface VentasRepository extends CrudRepository <Venta, Integer> {

}
