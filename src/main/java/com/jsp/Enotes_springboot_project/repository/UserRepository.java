package com.jsp.Enotes_springboot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Enotes_springboot_project.model.User;




public interface UserRepository extends JpaRepository<User, Integer> {

	public boolean existsByEmail(String email);

	public User findByEmail(String email);

}
