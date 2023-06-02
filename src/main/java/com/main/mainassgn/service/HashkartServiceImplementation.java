package com.main.mainassgn.service;

import com.main.mainassgn.models.User;
import com.main.mainassgn.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HashkartServiceImplementation {
    @Autowired
    private UserRepository userRepository;

   public String registerUser(User user)
    {
        userRepository.save(user);
        return "User registered successfully";
    }

}
