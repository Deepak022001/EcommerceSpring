package org.example.EcommerceSpring.service;

import org.example.EcommerceSpring.dto.ProductDTO;
import org.example.EcommerceSpring.entity.Product;
import org.springframework.stereotype.Service;


public interface IProductService {
    ProductDTO getProductById(Long id) throws Exception ;
    ProductDTO createProduct(ProductDTO dto) throws Exception;
}
