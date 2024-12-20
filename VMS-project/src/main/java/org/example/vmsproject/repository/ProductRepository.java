package org.example.vmsproject.repository;


import org.example.vmsproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.warehouse.warehouseId = :warehouseId")
    List<Product> findAllByWarehouseId(@Param("warehouseId") Long warehouseId);
}
