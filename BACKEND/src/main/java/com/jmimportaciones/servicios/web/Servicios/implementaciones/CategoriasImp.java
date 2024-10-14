package com.jmimportaciones.servicios.web.Servicios.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmimportaciones.servicios.web.Entidades.Categorias;
import com.jmimportaciones.servicios.web.Repositorios.CategoriasRepository;
import com.jmimportaciones.servicios.web.Servicios.interfaces.CategoriasInterf;

@Service
public class CategoriasImp implements CategoriasInterf{

    @Autowired
    private CategoriasRepository repositorio;

    @Override
    public List<Categorias> findAll(){
        return repositorio.findAll();
    }

    @Override
    public Optional<Categorias> findByID(Integer id) {
        return repositorio.findById(id);
    }

    @Override
    public Categorias save(Categorias categoria) {
        return repositorio.save(categoria);
    }

    @Override
    public void delete(Integer id) {
        repositorio.deleteById(id);
    }

    @Override
    public Optional<Categorias> findById(Integer id) {
        return repositorio.findById(id);
    }

}
