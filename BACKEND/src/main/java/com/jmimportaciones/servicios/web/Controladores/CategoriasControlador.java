package com.jmimportaciones.servicios.web.Controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmimportaciones.servicios.web.Entidades.Categorias;
import com.jmimportaciones.servicios.web.Servicios.interfaces.CategoriasInterf;

@RestController
@RequestMapping("/api/categorias")
public class CategoriasControlador {

    @Autowired
    private CategoriasInterf servicio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarCategorias(){
        return ResponseEntity.ok(servicio.findAll());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listarCategoriaById(@PathVariable(value="id") Integer id){
        Optional<Categorias> categoria = servicio.findById(id);
        if(categoria.isPresent()){
            return ResponseEntity.ok(categoria);
        }
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearCategoria(@RequestBody Categorias categoria){
        return ResponseEntity.ok(servicio.save(categoria));
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public ResponseEntity<?> editarCategoria(@RequestBody Categorias categoria){
        return ResponseEntity.ok(servicio.save(categoria));
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value="id") Integer id){
        Optional<Categorias> categoria = servicio.findById(id);
        if(categoria.isPresent()){
            servicio.delete(id);
            return ResponseEntity.ok(categoria);
        }
        return ResponseEntity.notFound().build();
    }

}
