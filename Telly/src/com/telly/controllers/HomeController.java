package com.telly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showHome() {
		
		return "home";
	}
    
    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }
    
    @RequestMapping("/loggedout")
    public String showLogout() {
        return "loggedout";
    }
}
