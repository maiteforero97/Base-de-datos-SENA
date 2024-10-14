
package com.jmimportaciones.servicios.web.Servicios.interfaces;

import java.util.List;
import java.util.Optional;

import com.jmimportaciones.servicios.web.Entidades.Productos;

public interface ProductosInterf {

    public List<Productos> findAll();
    public Optional<Productos> findByID(Integer id);
    public Productos save(Productos productos);
    public void delete(Integer id);
    public Optional<Productos> findById(Integer id);
    public Optional<List<Productos>> buscar(String nombre);

}
