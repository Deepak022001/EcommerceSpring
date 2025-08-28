package org.example.EcommerceSpring.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Category extends BaseEntity{

    @Column(nullable = false,unique = true)
    private String name;
//    one category has many products
    @OneToMany(mappedBy = "category" ,fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    private List<Product> products;
}
