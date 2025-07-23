package org.example.EcommerceSpring.Gateway;
import org.example.EcommerceSpring.DTO.CategoryDTO;
import org.example.EcommerceSpring.DTO.FakeStoreCategoreResponseDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.util.List;
@Component("fakeStoreRestTemplateGateway")
public class FakeStoreRestTemplateGateway implements ICategoryGateway{
   private final RestTemplateBuilder restTemplateBuilder;
   public FakeStoreRestTemplateGateway(RestTemplateBuilder restTemplateBuilder){
       this.restTemplateBuilder=restTemplateBuilder;
   }
   @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
    RestTemplate restTemplate = restTemplateBuilder.build();
    String url="https://fakestoreapi.in/api/products/category";
    ResponseEntity <FakeStoreCategoreResponseDTO> response= restTemplate.getForEntity(url, FakeStoreCategoreResponseDTO.class);
    if(response.getBody() == null){
        throw new IOException("Failed to fetch categories from FakeStore API");
    }
    return response.getBody().getCategories().stream().map((String category) -> CategoryDTO.builder().name(category).build()).toList();
   }
}
