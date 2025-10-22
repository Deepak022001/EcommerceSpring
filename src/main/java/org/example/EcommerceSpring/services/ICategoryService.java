package org.example.EcommerceSpring.services;

import org.example.EcommerceSpring.DTO.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
//    Function
    public List<CategoryDTO>getAllCategories() throws IOException;
}
