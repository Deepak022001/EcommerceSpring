package org.example.EcommerceSpring.gateway;
import org.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import org.example.EcommerceSpring.dto.ProductDTO;
import org.example.EcommerceSpring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;


import java.io.IOException;

@Component
public class FakeStoreProductGateway implements IProductGateway{
    private final FakeStoreProductApi fakeStoreProductApi;
    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi){
        this.fakeStoreProductApi=fakeStoreProductApi;
    }
    public ProductDTO getProductById(Long id) throws Exception {
        FakeStoreProductResponseDTO responseDTO=this.fakeStoreProductApi.getFakeProduct(id).execute().body();
        if (responseDTO==null){
            throw new Exception("Product not found");
        }
        return responseDTO.getProduct();
    }
}
