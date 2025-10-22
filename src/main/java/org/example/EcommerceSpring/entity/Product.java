package org.example.EcommerceSpring.entity;
<<<<<<< HEAD

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
=======
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity{
    private String image;
    private String color;
    private int price ;
    private String description;
    private int discount;
    private String model;
    private long id;
    private String title;
    private String brand;
    private boolean popular;
//    Each product belongs to one category
//    and one category can have many products
    @ManyToOne
    @JoinColumn(name = "categoryId" , nullable = false)
    private Category category;
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
}
