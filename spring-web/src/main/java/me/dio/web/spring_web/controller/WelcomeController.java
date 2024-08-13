package me.dio.web.spring_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping
	public String welcome() {
		return "Seja bem-vindo ao meu projeto Spring Boot Web API";
	}
}
