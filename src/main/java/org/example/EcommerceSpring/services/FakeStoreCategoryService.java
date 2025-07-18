package org.example.EcommerceSpring.services;

import org.example.EcommerceSpring.DTO.CategoryDTO;
import org.example.EcommerceSpring.Gateway.FakeStoreCategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public  class FakeStoreCategoryService implements ICategoryService {
    private final FakeStoreCategoryGateway fakeStoreCategoryGateway;
    public FakeStoreCategoryService(FakeStoreCategoryGateway fakeStoreCategoryGateway){
        this.fakeStoreCategoryGateway=fakeStoreCategoryGateway;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.fakeStoreCategoryGateway.getAllCategories();
    }
}
