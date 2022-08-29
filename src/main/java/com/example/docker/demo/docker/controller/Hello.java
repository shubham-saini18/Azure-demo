package com.example.docker.demo.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/hi")
        public String print()
        {
        	return "hello from Azure..!!";
        }
}
