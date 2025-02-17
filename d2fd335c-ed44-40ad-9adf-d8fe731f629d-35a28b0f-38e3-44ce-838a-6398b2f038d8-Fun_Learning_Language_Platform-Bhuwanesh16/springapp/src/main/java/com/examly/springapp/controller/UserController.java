package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.entities.User;
import com.examly.springapp.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

@Autowired
private UserService userService;

@PostMapping
public ResponseEntity<User> createUser(@RequestBody User user) {
    User createdUser = userService.createUser(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
}

@GetMapping("/{id}")
public ResponseEntity<User> getUserById(@PathVariable Long id) {
User user = userService.getUserById(id);
return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
}

@GetMapping
public ResponseEntity<List<User>> getAllUsers() {
return ResponseEntity.ok(userService.getAllUsers());
}

@PutMapping("/{id}")
public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
User updatedUser = userService.updateuser(id, user);
return updatedUser != null ? ResponseEntity.ok(updatedUser) : ResponseEntity.notFound().build();
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
return userService.deleteUser(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
}
}