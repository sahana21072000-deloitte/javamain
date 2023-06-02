package com.main.mainassgn.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String name;
}
