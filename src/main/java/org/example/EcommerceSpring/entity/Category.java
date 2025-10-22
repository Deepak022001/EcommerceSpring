package org.example.EcommerceSpring.entity;
<<<<<<< HEAD
=======

>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
<<<<<<< HEAD
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
=======
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
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
}
