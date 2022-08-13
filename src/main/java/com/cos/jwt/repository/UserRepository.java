package com.cos.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.jwt.model.JUser;

public interface UserRepository extends JpaRepository<JUser, Long>{

	public JUser findByUsername(String username);
}
