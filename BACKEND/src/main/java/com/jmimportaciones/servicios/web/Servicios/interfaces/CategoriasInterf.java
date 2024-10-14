
package com.jmimportaciones.servicios.web.Servicios.interfaces;

import java.util.List;
import java.util.Optional;

import com.jmimportaciones.servicios.web.Entidades.Categorias;

public interface CategoriasInterf {

    public List<Categorias> findAll();
    public Optional<Categorias> findByID(Integer id);
    public Categorias save(Categorias categorias);
    public void delete(Integer id);
    public Optional<Categorias> findById(Integer id);

}
