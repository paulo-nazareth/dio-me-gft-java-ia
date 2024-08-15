package me.dio.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping
	public String welcome() {
		return "Seja bem-vindo ao meu projeto Spring Boot Web API";
	}
	
	@GetMapping("/users")
	//Transferindo Responsabilidade para o WebSecurityConfig
//	@PreAuthorize("hasAnyRole('MANAGERS','USERS')")
	public String users() {
		return "Authorized user";
	}
	
	@GetMapping("/managers")
	//Transferindo Responsabilidade para o WebSecurityConfig
//	@PreAuthorize("hasRole('MANAGERS')")
	public String managers() {
		return "Authorized managers";
	}
	
}
