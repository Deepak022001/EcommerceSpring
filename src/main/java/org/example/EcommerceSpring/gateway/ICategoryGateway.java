package org.example.EcommerceSpring.gateway;

import org.example.EcommerceSpring.dto.CategoryDTO;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;
@Controller
public interface ICategoryGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
}
