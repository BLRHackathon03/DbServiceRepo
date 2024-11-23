package com.indium.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indium.java.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
