package com.main.mainassgn.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Product_Category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private int categoryId;

}
