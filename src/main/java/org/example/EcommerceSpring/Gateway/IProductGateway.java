package org.example.EcommerceSpring.Gateway;

import org.example.EcommerceSpring.DTO.ProductDTO;

import java.io.IOException;

public interface IProductGateway {
    ProductDTO getProductById(Long id) throws IOException;
}
