package org.example.EcommerceSpring.gateway;
import org.example.EcommerceSpring.dto.CategoryDTO;
import org.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import org.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import org.example.EcommerceSpring.mappers.GetAllCategoriesMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
@Component("fakestoreresttemplategateway")
public class FakeStoreRestTemplateGateway implements ICategoryGateway{
//    private final RestTemplate restTemplate=new RestTemplate();
    private final RestTemplateBuilder restTemplateBuilder;
    public FakeStoreRestTemplateGateway(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder=restTemplateBuilder;
    }
    private final String baseURL="https://fakestoreapi.com/products/category";
    @Override
    public List<CategoryDTO>getAllCategories()throws IOException{
        RestTemplate restTemplate=restTemplateBuilder.build();
         ResponseEntity<FakeStoreCategoryResponseDTO>response=restTemplate.getForEntity(baseURL, FakeStoreCategoryResponseDTO.class);
//        return response.getBody().getCategories().stream()
//                .map(category -> CategoryDTO.builder().name(category).build())
//                .toList();
        return GetAllCategoriesMapper.toCategoryDto(response.getBody());


    }
}
