package com.example.ApiHTG.controller;

import com.example.ApiHTG.entity.Productos;
import com.example.ApiHTG.service.ProductosHATGservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "api/v1/productosHATG")
public class ProductoHATGcontroller {

    @Autowired
    private ProductosHATGservice productosHATGservice;

    @GetMapping
    public List<Productos> getAllProductos() {
        return productosHATGservice.getProductosHATG();
    }

    @GetMapping("/productoId")
    public Optional<Productos> getBId(@PathVariable("productoId")Long productoId) {
        return productosHATGservice.getProductosHATG(productoId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Productos producto) {
        productosHATGservice.saveOrUpdate(producto);
    }

    @DeleteMapping("/{productoId}")
    public void saveUpdate(@PathVariable("productoId") Long productoId) {
        productosHATGservice.delete(productoId);
    }
}
