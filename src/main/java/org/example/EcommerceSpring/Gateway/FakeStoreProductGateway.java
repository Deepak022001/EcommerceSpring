package org.example.EcommerceSpring.Gateway;

import org.example.EcommerceSpring.DTO.FakeStoreProductResponseDTO;
import org.example.EcommerceSpring.DTO.ProductDTO;
import org.example.EcommerceSpring.Gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
public class FakeStoreProductGateway implements IProductGateway {
    private  final FakeStoreProductApi fakeStoreProductApi;
    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi){
        this.fakeStoreProductApi=fakeStoreProductApi;
    }
    public ProductDTO getProductById(Long id) throws IOException{
        FakeStoreProductResponseDTO response=this.fakeStoreProductApi.getFakeProduct(id).execute().body();
        if(response == null){
            throw new IOException("Product not found");
        }
        return response.getProduct();
    }
}
