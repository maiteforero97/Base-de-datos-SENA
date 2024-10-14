package com.jmimportaciones.servicios.web.Controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmimportaciones.servicios.web.Entidades.Productos;
import com.jmimportaciones.servicios.web.Servicios.interfaces.ProductosInterf;

@RestController
@RequestMapping("/api/productos")
public class ProductosControlador {

    @Autowired
    private ProductosInterf servicio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarProductos(){
        return ResponseEntity.ok(servicio.findAll());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listarProductosById(@PathVariable(value="id") Integer id){
        Optional<Productos> producto = servicio.findById(id);
        if(producto.isPresent()){
            return ResponseEntity.ok(producto);
        }
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearProductos(@RequestBody Productos productos){
        return ResponseEntity.ok(servicio.save(productos));
    }

    @CrossOrigin(origins = "*")
    @PatchMapping
    public ResponseEntity<?> buscarProductos(@RequestBody Productos productos){
        return ResponseEntity.ok(servicio.buscar(productos.getNombre()));
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public ResponseEntity<?> editarProducto(@RequestBody Productos productos){
        return ResponseEntity.ok(servicio.save(productos));
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value="id") Integer id){
        Optional<Productos> producto = servicio.findById(id);
        if(producto.isPresent()){
            servicio.delete(id);
            return ResponseEntity.ok(producto);
        }
        return ResponseEntity.notFound().build();
    }

}
