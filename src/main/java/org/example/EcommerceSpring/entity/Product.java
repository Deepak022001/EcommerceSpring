package org.example.EcommerceSpring.entity;
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
}
