package com.jmimportaciones.servicios.web.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import io.micrometer.common.lang.NonNull;

import jakarta.persistence.Column;


@Entity
@Table(name="productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    
    @Column(name="nombre", nullable = false, length = 60)
    @NonNull
    private String nombre;

    
    @Column(name="precio", nullable = false, length = 12)
    @NonNull
    private Integer precio;

    
    @Column(name="proveedor", nullable = false, length = 60)
    @NonNull
    private String proveedor;

    
    @Column(name="stock", nullable = false, length = 12)
    @NonNull
    private Integer stock;

    
    @Column(name="categorias_Id", nullable = false, length = 12)
    @NonNull
    private Integer categorias_Id;

       public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCategorias_Id() {
        return categorias_Id;
    }

    public void setCategorias_Id(int categorias_Id) {
        this.categorias_Id = categorias_Id;
    }

}