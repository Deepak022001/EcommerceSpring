package org.example.EcommerceSpring.controllers;
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
    }
}
