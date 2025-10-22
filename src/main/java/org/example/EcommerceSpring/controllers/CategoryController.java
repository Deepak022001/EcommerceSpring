package org.example.EcommerceSpring.controllers;
<<<<<<< HEAD
import org.example.EcommerceSpring.dto.CategoryDTO;
import org.example.EcommerceSpring.entity.Category;
import org.example.EcommerceSpring.service.ICategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@Controller
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private ICategoryService categoryService;
    public CategoryController( @Qualifier("categoryService") ICategoryService _categoryService){
        this.categoryService=_categoryService;
    }
    @GetMapping
   public ResponseEntity<?> getAllCategories(@RequestParam(required = false) String name) throws Exception {
//        49 relation in jpa
        if(name !=null &&  !name.isBlank()){
            CategoryDTO categoryDTO=categoryService.getByName(name);
            return ResponseEntity.ok(categoryDTO);
        }else{
            List<CategoryDTO>result=this.categoryService.getAllCategories();
            return ResponseEntity.ok(result);
        }
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO){

        CategoryDTO created=categoryService.createCategory(categoryDTO);
        return ResponseEntity.ok(created);
=======


import org.example.EcommerceSpring.DTO.CategoryDTO;
import org.example.EcommerceSpring.services.FakeStoreCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<CategoryDTO>> getAllCategories() throws IOException {
        List<CategoryDTO> result= this.categoryService.getAllCategories();
        return ResponseEntity.ok(result);
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
    }
}
