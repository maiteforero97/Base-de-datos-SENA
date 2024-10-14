package com.jmimportaciones.servicios.web.Servicios.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmimportaciones.servicios.web.Entidades.Productos;
import com.jmimportaciones.servicios.web.Repositorios.ProductosRepository;
import com.jmimportaciones.servicios.web.Servicios.interfaces.ProductosInterf;

@Service
public class ProductosImp implements ProductosInterf{

    @Autowired
    private ProductosRepository repositorio;

    @Override
    public List<Productos> findAll(){
        return repositorio.findAll();
    }

    @Override
    public Optional<List<Productos>> buscar(String nombre){
        return repositorio.findByNombreLike(nombre);
    }

    @Override
    public Optional<Productos> findByID(Integer id) {
        return repositorio.findById(id);
    }

    @Override
    public Productos save(Productos productos) {
        return repositorio.save(productos);
    }

    @Override
    public void delete(Integer id) {
        repositorio.deleteById(id);
    }

    @Override
    public Optional<Productos> findById(Integer id) {
        return repositorio.findById(id);
    }

}
