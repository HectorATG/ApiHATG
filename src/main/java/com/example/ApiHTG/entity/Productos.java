package com.example.ApiHTG.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_Produtos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long produtoId;

    private String nombre;

    private String descripcion;

    private String imagen;

    private int cantidad;

    private double precio;

}
