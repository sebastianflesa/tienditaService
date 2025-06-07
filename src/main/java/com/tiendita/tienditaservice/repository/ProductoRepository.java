package com.tiendita.tienditaservice.repository;
import com.tiendita.tienditaservice.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
