package org.example.EcommerceSpring.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductDTO {
    private String image;
    private String color;
    private int price ;
    private String description;
    private int discount;
    private String model;
    private int id;
    private String title;
    private String Category;
    private String brand;
    private boolean popular;
}
