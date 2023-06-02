package com.main.mainassgn.service;

import com.main.mainassgn.models.Products;
import com.main.mainassgn.models.User;
import com.main.mainassgn.repositories.ProductsRepository;
import com.main.mainassgn.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HashkartServiceImplementation {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductsRepository products;


   public String registerUser(User user)
    {
        userRepository.save(user);
        return "User registered successfully";
    }

    public List<Products> products(String username , String password){

       List<Products> productsList = products.productList();
       return productsList;
    }


}
