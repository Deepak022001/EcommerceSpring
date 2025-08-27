package org.example.EcommerceSpring.controllers;


import org.example.EcommerceSpring.DTO.ProductDTO;
import org.example.EcommerceSpring.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService productService;
    public ProductController(IProductService productService){
        this.productService=productService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws Exception {
        ProductDTO response = this.productService.getProductById(id);
        return ResponseEntity.ok(response);
    }
    @PostMapping
    public ResponseEntity<ProductDTO>createProduct(@RequestBody ProductDTO dto){
        return ResponseEntity.ok(productService.createProduct(dto));
    }

}
