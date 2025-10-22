package org.example.EcommerceSpring.service;

import org.example.EcommerceSpring.dto.CategoryDTO;
import org.example.EcommerceSpring.entity.Category;
import org.example.EcommerceSpring.mappers.CategoryMapper;
import org.example.EcommerceSpring.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryService implements ICategoryService{
    private final CategoryRepository categoryRepository;
    public CategoryService( CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        List<CategoryDTO>dtos=new ArrayList<>();
        for (Category category : categoryRepository.findAll()){
            dtos.add(CategoryMapper.toDto(category));
        }
        return dtos;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category=CategoryMapper.toEntity(categoryDTO);
        Category saved=categoryRepository.save(category);
        return CategoryMapper.toDto(saved);
    }

    @Override
    public CategoryDTO getByName(String name) throws Exception {
        Category category = categoryRepository.findByName(name)
                .orElseThrow(() -> new Exception("Category not found"));
        return CategoryMapper.toDto(category);
    }
}
