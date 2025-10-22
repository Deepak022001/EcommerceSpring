package org.example.EcommerceSpring.mappers;
<<<<<<< HEAD
import org.example.EcommerceSpring.dto.CategoryDTO;
import org.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import org.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;

import java.util.List;
public class GetAllCategoriesMapper {
    public static FakeStoreCategoryResponseDTO toFakeStoreCategoryDTO(){
        return null;
    }
    public static List<CategoryDTO>toCategoryDto(FakeStoreCategoryResponseDTO dto){
    return dto.getCategories().stream().map(category->CategoryDTO.builder().name(category).build()).toList();
=======

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
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
    }
}
