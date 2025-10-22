package org.example.EcommerceSpring.service;

import org.example.EcommerceSpring.dto.CategoryDTO;
import org.example.EcommerceSpring.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService{
    private final ICategoryGateway categoryGateway;
    public FakeStoreCategoryService(@Qualifier("fakestoreresttemplategateway")ICategoryGateway categoryGateway){
        this.categoryGateway=categoryGateway;
    }
    public List<CategoryDTO> getAllCategories() throws IOException {
    return categoryGateway.getAllCategories();
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public CategoryDTO getByName(String name) throws Exception {
        return null;
    }

}
