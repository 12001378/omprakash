package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blog.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

@Query("select u from User  u where u.email= :email")
	
	public User getUserByUsername(@Param("email") String email);
}
