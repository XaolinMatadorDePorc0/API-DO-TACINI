package com.belval.crudrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



//Ctrl + SHIFT + S -> Salva todos os arquivos pendentes de salvamento
//Ctrl + SHIFT + O -> Adiciona os import's e Organiza-os
@RestController
@SpringBootApplication
public class CrudrestApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(CrudrestApplication.class, args);
	}
	
	@GetMapping("/eco")
	public String eco() {
		return "eco";
	}

}
