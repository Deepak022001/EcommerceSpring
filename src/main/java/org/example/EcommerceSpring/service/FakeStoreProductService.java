package org.example.EcommerceSpring.service;
import org.example.EcommerceSpring.dto.ProductDTO;
import org.example.EcommerceSpring.gateway.IProductGateway;
import org.springframework.stereotype.Service;
@Service
public class FakeStoreProductService implements IProductService{
    private  IProductGateway productGateway;
    public FakeStoreProductService(IProductGateway productGateway){
        this.productGateway=productGateway;
    }
    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        return productGateway.getProductById(id);
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) {
        return null;
    }
}
