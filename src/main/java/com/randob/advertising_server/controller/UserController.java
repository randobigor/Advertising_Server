package com.randob.advertising_server.controller;

import com.randob.advertising_server.model.User;
import com.randob.advertising_server.reposiroy.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
  private final UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @PostMapping
  public User submitUser(@RequestBody User user) {
    return userRepository.save(user);
  }
}
