package com.examly.springapp.services.impl;

import com.examly.springapp.entities.User;
import com.examly.springapp.repositories.UserRepository;
import com.examly.springapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
        }

        @Override
        public User getUserById(Long id) {
            return userRepository.findById(id).orElse(null);
            }

            @Override
            public List<User> getAllUsers() {
            return userRepository.findAll();
            }

            // @Override
            // public User updateUser(Long id, User user) {
            //     Optional<User> existingUser = userRepository.findById(id);
            //     if (existingUser.isPresent()) {
            //         user.setId(id);
            //         return userRepository.save(user);
            //         }
            //         return null;
            //         }

                    @Override
                    public boolean deleteUser(Long id) {
                    if (userRepository.existsById(id)) {
                        userRepository.deleteById(id);
                        return true;
                        }
                        return false;
                        }

                    @Override
                    public User updateuser(Long id, User user) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'updateuser'");
                    }
                        }