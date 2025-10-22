package org.example.EcommerceSpring.gateway.api;

import org.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FakeStoreCategoryApi {

    @GET("products/categories")
    Call<FakeStoreCategoryResponseDTO>getAllFakeCategories();
}
