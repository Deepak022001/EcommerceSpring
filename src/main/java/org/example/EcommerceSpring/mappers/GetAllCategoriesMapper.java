package org.example.EcommerceSpring.mappers;

import org.example.EcommerceSpring.DTO.CategoryDTO;
import org.example.EcommerceSpring.DTO.FakeStoreCategoreResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

public class GetAllCategoriesMapper {

    // If needed in future, implement this method properly
    public static FakeStoreCategoreResponseDTO toFakeStoreCategoriesDTO() {
        return null;
    }

    public static List<CategoryDTO> categoryDTO(FakeStoreCategoreResponseDTO dto) {
        return dto.getCategories()
                .stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .collect(Collectors.toList());
    }
}
