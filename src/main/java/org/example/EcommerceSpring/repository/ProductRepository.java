package org.example.EcommerceSpring.repository;

import org.example.EcommerceSpring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT p from Product p WHERE p.price>:minPrice")
    List<Product> findExpensiveProducts(@Param("minPrice")double minPrice);
=======

public interface ProductRepository extends JpaRepository<Product,Long> {
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
}
