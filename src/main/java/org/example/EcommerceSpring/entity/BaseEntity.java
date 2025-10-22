package org.example.EcommerceSpring.entity;

import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.Getter;
import lombok.Setter;
=======
import lombok.*;
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
<<<<<<< HEAD
public class BaseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @CreatedDate
    @Column(nullable = false,updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private Instant updatedAt;

//    should not be declared private because jpa provider will call this so it should not be declared
//  private
    @PrePersist
    protected void onCreate(){
        Instant now=Instant.now();
        this.createdAt=now;
        this.updatedAt=now;
    }
    @PreUpdate
    protected void onUpdate(){
=======
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @CreatedDate
    @Column(nullable = false ,updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(nullable = false,updatable = false)
    private Instant updatedAt;

    @PrePersist
    public void onCreate(){
        Instant now =Instant.now();
        this.createdAt=now;
        this.updatedAt=now;
    }

    @PreUpdate
    public void onUpdate(){
>>>>>>> cc1547424d8bc5977dc85e0cc1ab345802adebb0
        this.updatedAt=Instant.now();

    }
}
