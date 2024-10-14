package com.jmimportaciones.servicios.web.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmimportaciones.servicios.web.Entidades.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {

    
}