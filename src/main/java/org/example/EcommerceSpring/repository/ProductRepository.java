package org.example.EcommerceSpring.repository;

import org.example.EcommerceSpring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
