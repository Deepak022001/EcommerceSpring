package org.example.EcommerceSpring.Gateway;

import org.example.EcommerceSpring.DTO.CategoryDTO;
import org.example.EcommerceSpring.DTO.FakeStoreCategoreResponseDTO;
import org.example.EcommerceSpring.Gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {
    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi=fakeStoreCategoryApi;
    }
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoreResponseDTO response= this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();
        if(response == null){
            throw new IOException("Failed to fetch categories from FakeStore API");
        }
        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder().name(category).build()).toList();
    }
}
