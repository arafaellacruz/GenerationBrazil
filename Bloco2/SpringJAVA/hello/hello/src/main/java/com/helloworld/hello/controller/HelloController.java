package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/2")
	public String hello2() {
		return "Hello Família 41!";
	}

	@GetMapping("/mentalidades")
	public String mentalidades() {
		return "Mentalidades utilizadas para realizar a atividade: Persistência e Orientação ao futuro.";
	}

	@GetMapping("/objetivos")
	public String objetivos() {
		return "O objetivo de aprendizagem foi iniciarmos o estudo de banco de dados em MySQL e como utilizar o Spring!";
	}

}
