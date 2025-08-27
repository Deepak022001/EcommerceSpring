package org.example.EcommerceSpring.mappers;

import org.example.EcommerceSpring.DTO.ProductDTO;
import org.example.EcommerceSpring.entity.Product;

public class ProductMapper {
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
                .Category(product.getCategory())
                .brand(product.getBrand())
                .popular(product.isPopular())
                .build();
    }
    public static Product toEntity(ProductDTO dto) {
        return Product.builder()
                .id(dto.getId())
                .image(dto.getImage())
                .color(dto.getColor())
                .price(dto.getPrice())
                .description(dto.getDescription())
                .discount(dto.getDiscount())
                .model(dto.getModel())
                .title(dto.getTitle())
                .Category(dto.getCategory())
                .brand(dto.getBrand())
                .popular(dto.isPopular())
                .build();
    }
}
