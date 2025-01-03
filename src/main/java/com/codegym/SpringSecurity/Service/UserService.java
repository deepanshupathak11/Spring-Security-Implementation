package com.codegym.SpringSecurity.Service;

import com.codegym.SpringSecurity.Entity.Users;
import com.codegym.SpringSecurity.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Autowired
    UserRepository userRepository;

    public Users register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
