package com.example.basicspringbootmysql.repository;

import com.example.basicspringbootmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
