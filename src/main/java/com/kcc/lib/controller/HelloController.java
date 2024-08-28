package com.kcc.lib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	
	@GetMapping
	public String sayHi() {
		return "hi";
	}
}
