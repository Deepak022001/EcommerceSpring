package org.example.EcommerceSpring.mappers;

<<<<<<< HEAD
import org.example.EcommerceSpring.dto.ProductDTO;
import org.example.EcommerceSpring.entity.Category;
import org.example.EcommerceSpring.entity.Product;

public class ProductMapper {
    //Yes ✅ — in your method toDto(Product product),
//the goal is to convert an Entity (Product) into a DTO (ProductDTO).
=======
import org.example.EcommerceSpring.DTO.ProductDTO;
import org.example.EcommerceSpring.entity.Product;

public class ProductMapper {
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
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
<<<<<<< HEAD
                .categoryId(product.getCategory().getId())
=======
//                .Category(product.getCategory().getId())
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
                .brand(product.getBrand())
                .popular(product.isPopular())
                .build();
    }
<<<<<<< HEAD
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
=======
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
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
                .build();
    }
}
