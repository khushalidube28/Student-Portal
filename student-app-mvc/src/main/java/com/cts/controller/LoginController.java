package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.model.Login;
import com.cts.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/school")
	public String login(@ModelAttribute Login login,Model m ) {
		String username=login.getUsername();
		System.out.println(login);
		String password = login.getPassword();
		Login result = loginService.isValidCredentials(username, password);
		System.out.println(result);
		if(result!=null) {
			return "school";
		}
		else {
			m.addAttribute("message","Try Again!");
			return "login";
		}
			
	}
	

}
