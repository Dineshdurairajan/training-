package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/")
public String getHome() {
	return "index";
}
@RequestMapping("/Admin")
public String getAdmin() {
	return "admin";
}
@RequestMapping("/User")
public String getUser() {
	return "user";
}
}
