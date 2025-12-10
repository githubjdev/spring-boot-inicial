package ex.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	
	@GetMapping
	public String teste1() {
		return "Olá, Spring Boot!";
	}

	@GetMapping("/teste2")
	public String teste2() {
		return "Olá, Spring Boot 2!";
	}
	
	
	
}
