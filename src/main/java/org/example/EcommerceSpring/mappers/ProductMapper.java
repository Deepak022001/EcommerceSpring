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
//                .Category(product.getCategory().getId())
                .brand(product.getBrand())
                .popular(product.isPopular())
                .build();
    }
    public static Product toEntity(ProductDTO dto) {
        Product.ProductBuilder builder = Product.builder();
        builder.id(dto.getId());
        builder.image(dto.getImage());
        builder.color(dto.getColor());
        builder.price(dto.getPrice());
        builder.description(dto.getDescription());
        builder.discount(dto.getDiscount());
        builder.model(dto.getModel());
        builder.title(dto.getTitle());
        builder.brand(dto.getBrand());
        builder.popular(dto.isPopular());
        return builder
                .build();
    }
}
