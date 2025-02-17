package com.examly.springapp.services;


import java.util.List;

import com.examly.springapp.entities.User;


public interface UserService {
User createUser(User user);
User getUserById(Long id);
List<User> getAllUsers();
User updateuser(Long id,User user);
boolean deleteUser(Long id);
}