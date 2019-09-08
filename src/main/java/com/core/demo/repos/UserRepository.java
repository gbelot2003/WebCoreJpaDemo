package com.core.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String name);

}
		