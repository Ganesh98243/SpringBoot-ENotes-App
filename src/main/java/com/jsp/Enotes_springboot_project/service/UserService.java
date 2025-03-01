package com.jsp.Enotes_springboot_project.service;

import com.jsp.Enotes_springboot_project.model.User;

public interface UserService {

	public User saveUser(User user);

	public boolean existEmailCheck(String email);
	
	//added

}
