package org.example.EcommerceSpring.service;

import org.example.EcommerceSpring.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public interface ICategoryService {
    List<CategoryDTO> getAllCategories() throws IOException;

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO getByName(String name)throws Exception;
}
