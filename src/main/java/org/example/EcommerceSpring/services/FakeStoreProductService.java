package org.example.EcommerceSpring.services;

import org.example.EcommerceSpring.DTO.ProductDTO;
import org.example.EcommerceSpring.Gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public FakeStoreProductService(  IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        return productGateway.getProductById(id);
    }
}
