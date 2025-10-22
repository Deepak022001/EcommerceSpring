package org.example.EcommerceSpring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Product extends BaseEntity{
    private String image;
    private String color;
    private int price;
    private String description;
    private int discount;
    private String model;
    private String title;

//    way to communicate differnet table with each other
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
//    Many Product  could be associated with one category
    private Category category;
    private String brand;
    private boolean popular;
}
