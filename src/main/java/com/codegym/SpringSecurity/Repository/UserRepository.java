package com.codegym.SpringSecurity.Repository;


import com.codegym.SpringSecurity.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
//It requires 2 things
// 1. Class which will refer to the table i.e. Users (in our case)
// 2. DataType of Primary key
