package org.example.EcommerceSpring.mappers;

import org.example.EcommerceSpring.dto.ProductDTO;
import org.example.EcommerceSpring.entity.Category;
import org.example.EcommerceSpring.entity.Product;

public class ProductMapper {
    //Yes ✅ — in your method toDto(Product product),
//the goal is to convert an Entity (Product) into a DTO (ProductDTO).
    public static ProductDTO toDto(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .image(product.getImage())
                .color(product.getColor())
                .price(product.getPrice())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .model(product.getModel())
                .title(product.getTitle())
                .categoryId(product.getCategory().getId())
                .brand(product.getBrand())
                .popular(product.isPopular())
                .build();
    }
    public static Product toEntity(ProductDTO dto, Category category){
        return Product.builder()
//                .id(dto.getId())
                .image(dto.getImage())
                .color(dto.getColor())
                .price(dto.getPrice())
                .description(dto.getDescription())
                .discount(dto.getDiscount())
                .model(dto.getModel())
                .title(dto.getTitle())
                .category(category)
                .brand(dto.getBrand())
                .popular(dto.isPopular())
                .build();
    }
}
