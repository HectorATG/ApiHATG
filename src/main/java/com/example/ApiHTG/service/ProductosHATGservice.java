package com.example.ApiHTG.service;

import com.example.ApiHTG.entity.Productos;
import com.example.ApiHTG.repository.ProductosHATGrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosHATGservice {
    @Autowired
    ProductosHATGrepository productosHATGrepository;

    public List<Productos> getProductosHATG(){
        return productosHATGrepository.findAll();
    }

    public Optional<Productos> getProductosHATG(Long id){
        return productosHATGrepository.findById(id);
    }

    public void saveOrUpdate(Productos producto){
        productosHATGrepository.save(producto);
    }

    public void delete(Long id){
        productosHATGrepository.deleteById(id);
    }
}
