package org.example.EcommerceSpring.services;

import org.example.EcommerceSpring.DTO.ProductDTO;

import java.io.IOException;

public interface IProductService {
    ProductDTO getProductById(Long id) throws IOException;
}
