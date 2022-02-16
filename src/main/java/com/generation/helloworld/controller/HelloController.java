package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
	public String getHello () {
		return "Hello Turma44!";
	}
    @GetMapping("/bsm")
   	public String getHello2 () {
   		return "Persistência e Proatividade!";
    }		
    @GetMapping("/objetivo")
   	public String getHello3 () {
   		return "Estudar o maximo de Mysql e spring e revisar java!";
    }
}
