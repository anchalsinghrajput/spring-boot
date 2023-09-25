package com.infosys.anchal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

	@GetMapping("/home")
	public String myFirstApi() {
		return "anchal singh";
	}
}
