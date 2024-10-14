package com.jmimportaciones.servicios.web.Repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmimportaciones.servicios.web.Entidades.Productos;

@SuppressWarnings("unused")
public interface ProductosRepository extends JpaRepository<Productos, Integer> {

    Optional<List<Productos>> findByNombreLike(String nombre);
    
}