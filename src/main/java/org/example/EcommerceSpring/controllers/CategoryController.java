package org.example.EcommerceSpring.controllers;


import org.example.EcommerceSpring.DTO.CategoryDTO;
import org.example.EcommerceSpring.services.FakeStoreCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private  FakeStoreCategoryService categoryService;
    public  CategoryController(FakeStoreCategoryService _categoryService){
        this.categoryService=_categoryService;
    }
    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryService.getAllCategories();
    }
}
