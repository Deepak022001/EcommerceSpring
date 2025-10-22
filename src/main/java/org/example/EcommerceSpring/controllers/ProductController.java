package org.example.EcommerceSpring.controllers;
import org.example.EcommerceSpring.dto.ProductDTO;
import org.example.EcommerceSpring.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService productService;
    public ProductController(IProductService productService){
        this.productService=productService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO>getProductById(@PathVariable  Long id) throws Exception {
    ProductDTO result=productService.getProductById(id);
        return ResponseEntity.ok(result);
    }
    @PostMapping
    public ResponseEntity<ProductDTO>createProduct(@RequestBody ProductDTO dto) throws Exception {
        return ResponseEntity.ok(productService.createProduct(dto));
    }
}
