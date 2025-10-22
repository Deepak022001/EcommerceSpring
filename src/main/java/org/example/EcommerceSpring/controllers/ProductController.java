package org.example.EcommerceSpring.controllers;
<<<<<<< HEAD
import org.example.EcommerceSpring.dto.ProductDTO;
import org.example.EcommerceSpring.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

=======


import org.example.EcommerceSpring.DTO.ProductDTO;
import org.example.EcommerceSpring.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService productService;
    public ProductController(IProductService productService){
        this.productService=productService;
    }
    @GetMapping("/{id}")
<<<<<<< HEAD
    public ResponseEntity<ProductDTO>getProductById(@PathVariable  Long id) throws Exception {
    ProductDTO result=productService.getProductById(id);
        return ResponseEntity.ok(result);
    }
    @PostMapping
    public ResponseEntity<ProductDTO>createProduct(@RequestBody ProductDTO dto) throws Exception {
        return ResponseEntity.ok(productService.createProduct(dto));
    }
=======
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws Exception {
        ProductDTO response = this.productService.getProductById(id);
        return ResponseEntity.ok(response);
    }
    @PostMapping
    public ResponseEntity<ProductDTO>createProduct(@RequestBody ProductDTO dto){
        return ResponseEntity.ok(productService.createProduct(dto));
    }

>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
}
