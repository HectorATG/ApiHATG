package com.example.ApiHTG.repository;

import com.example.ApiHTG.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosHATGrepository extends JpaRepository<Productos, Long> {
    void deleteById(Long id);
}
