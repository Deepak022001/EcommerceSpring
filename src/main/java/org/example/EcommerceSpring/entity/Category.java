package org.example.EcommerceSpring.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Category extends BaseEntity{

    @Column(nullable = false,updatable = true)
    private String name;

    @OneToMany(mappedBy = "category")
//    onecategory could be associated to many products
    private List<Product>products;
}
