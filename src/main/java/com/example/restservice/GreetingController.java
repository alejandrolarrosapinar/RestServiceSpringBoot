package com.example.restservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


	@GetMapping("/personas")
	public Persona persona() {
		Persona p = new Persona();
		p.setNombre("alejandro");
		p.setApellidos("larrosa pinar");
		System.out.println(p.getNombre());
		return p;
	}
}
