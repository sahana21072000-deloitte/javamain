package com.main.mainassgn.controller;

import com.main.mainassgn.models.User;
import com.main.mainassgn.service.HashkartServiceImplementation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HashkartController {
    @Autowired
    private HashkartServiceImplementation hashkartServiceImplementation;

    @PostMapping("/register")
    String register(@RequestBody User user)
    {
        log.info("User Registration");
        String response = hashkartServiceImplementation.registerUser(user);
        log.info("Registration Done");
        return response;
    }
}
