package org.example.EcommerceSpring.Gateway.api;

import org.example.EcommerceSpring.DTO.FakeStoreCategoreResponseDTO;
import org.example.EcommerceSpring.DTO.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public interface FakeStoreProductApi {
    @GET("products/{id}")
    Call<FakeStoreProductResponseDTO> getFakeProduct(@Path("id") Long id) throws IOException;
}
