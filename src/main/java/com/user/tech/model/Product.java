package com.user.tech.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(name ="name")
    public String name;

    @Column(name ="price")
    public Double price;

    @Column(name ="product_type")
    public String productType;

    @Column(name ="product_code")
    public Long productCode;

    @Column(name ="year")
    public Long year;
}
