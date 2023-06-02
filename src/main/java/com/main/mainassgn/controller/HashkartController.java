package com.main.mainassgn.controller;

import com.main.mainassgn.models.Products;
import com.main.mainassgn.models.User;
import com.main.mainassgn.service.HashkartServiceImplementation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class HashkartController {
    @Autowired
    private HashkartServiceImplementation hashkartServiceImplementation;

    @PostMapping("/register")
    ResponseEntity<String> register(@RequestBody User user)
    {
        log.info("User  is Registering");
        String response = hashkartServiceImplementation.registerUser(user);
        log.info("Registration Done");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/products")
    ResponseEntity<List<Products>> products(@RequestParam String username, @RequestParam String password){
        List<Products> reponse = hashkartServiceImplementation.products(username, password);
        return new ResponseEntity<>(reponse, HttpStatus.OK);
    }
}
