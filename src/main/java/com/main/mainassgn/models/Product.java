package com.main.mainassgn.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String name;
    private String description;
    private Double price;
    private int quantity;

}
