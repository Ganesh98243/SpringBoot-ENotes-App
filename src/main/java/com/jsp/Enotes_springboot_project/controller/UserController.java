package com.jsp.Enotes_springboot_project.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.Enotes_springboot_project.model.User;
import com.jsp.Enotes_springboot_project.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@ModelAttribute
	public void getUser(Principal p, Model m) {
		String email = p.getName(); //it gives the email because the user loggedin based on email and password, if user
							//loggedin based on name and password then it return name;
		User user = userRepo.findByEmail(email);
		m.addAttribute("user", user);
	}

	@GetMapping("/addNotes")
	public String addNotes() {
		return "add_notes";
	}

	@GetMapping("/viewNotes")
	public String viewNotes() {
		return "view_notes";
	}

	@GetMapping("/editNotes")
	public String editNotes() {
		return "edit_notes";
	}
}
