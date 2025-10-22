package org.example.EcommerceSpring.gateway;
import org.example.EcommerceSpring.dto.CategoryDTO;
import org.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import org.example.EcommerceSpring.gateway.api.FakeStoreCategoryApi;
import org.example.EcommerceSpring.mappers.GetAllCategoriesMapper;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.List;
@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {
    private final FakeStoreCategoryApi fakeStoreCategoryApi;
    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDTO response =
                this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();
        if (response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }
//        return response.getCategories()
//                .stream()
//                .map(category -> CategoryDTO.builder().name(category).build())
//                .toList();
        return GetAllCategoriesMapper.toCategoryDto(response);
    }
}
