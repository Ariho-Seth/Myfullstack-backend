package com.ariho.fullstack_backend.Controller;


import com.ariho.fullstack_backend.Exception.UserNotFoundException;
import com.ariho.fullstack_backend.Model.User;
import com.ariho.fullstack_backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class UserController{
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable long id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }
}
