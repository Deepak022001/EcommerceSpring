package org.example.EcommerceSpring.Gateway;

import org.example.EcommerceSpring.DTO.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
}
