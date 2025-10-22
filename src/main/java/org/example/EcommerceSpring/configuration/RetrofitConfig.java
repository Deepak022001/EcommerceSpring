package org.example.EcommerceSpring.configuration;
<<<<<<< HEAD
import org.example.EcommerceSpring.gateway.api.FakeStoreCategoryApi;
import org.example.EcommerceSpring.gateway.api.FakeStoreProductApi;
=======

import org.example.EcommerceSpring.Gateway.api.FakeStoreCategoryApi;
import org.example.EcommerceSpring.Gateway.api.FakeStoreProductApi;
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
<<<<<<< HEAD
@Configuration
public class RetrofitConfig {
    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/") // Example free API
=======

@Configuration
public class RetrofitConfig {
    @Bean
   public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/")
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    @Bean
<<<<<<< HEAD
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(FakeStoreCategoryApi.class);
    }
    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit) {
=======
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit){
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
        return retrofit.create(FakeStoreProductApi.class);
    }
}
