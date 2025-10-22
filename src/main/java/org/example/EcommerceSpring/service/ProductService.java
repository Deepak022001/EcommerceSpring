package org.example.EcommerceSpring.service;

import org.example.EcommerceSpring.dto.ProductDTO;
import org.example.EcommerceSpring.entity.Category;
import org.example.EcommerceSpring.entity.Product;
import org.example.EcommerceSpring.mappers.ProductMapper;
import org.example.EcommerceSpring.repository.CategoryRepository;
import org.example.EcommerceSpring.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new Exception("Product not found"));
        return ProductMapper.toDto(product);
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) throws Exception {
        Category category = categoryRepository.findById(dto.getCategoryId())
                .orElseThrow(() -> new Exception("Category not found"));
        Product saved = productRepository.save(ProductMapper.toEntity(dto, category));
        return ProductMapper.toDto(saved);
    }
}
