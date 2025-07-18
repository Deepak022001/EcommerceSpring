package org.example.EcommerceSpring.Gateway.api;

import org.example.EcommerceSpring.DTO.FakeStoreCategoreResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;
@Component
public interface FakeStoreCategoryApi {
    @GET("products/category")
    Call<FakeStoreCategoreResponseDTO> getAllFakeCategories();
}
