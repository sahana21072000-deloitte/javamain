package com.main.mainassgn.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long userId;

    @Column(nullable = false,name="username")
    private String username;

    @Column(nullable = false,name="password")
    private String password;

    @Column(nullable = false,name="email")
    private String email;

}
