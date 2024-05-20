package com.example.demo.repository;
import com.example.demo.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // signals that this interface object is database related crud operations object
public interface UserRepository extends JpaRepository<User, Integer> {

//	List<Student> findByName(String name);
//
//	List<Student> findByPosition(String position);
}