package com.tiendita.tienditaservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tiendita.tienditaservice.dto.ProductoDTO;
import com.tiendita.tienditaservice.model.Producto;
import com.tiendita.tienditaservice.repository.ProductoRepository;

@RestController
@RequestMapping("/productos")
public class ProductosController {
    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping("/listar")
    public List<Producto> listarProductos() {
        List<Producto> productos = productoRepository.findAll();
        return productos;
    }
}
