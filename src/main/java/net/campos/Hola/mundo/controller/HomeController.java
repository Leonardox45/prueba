package net.campos.Hola.mundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String inicio() {
	int x=0,y=3, resul=0;
	resul= x+y;
	if (resul>0) {
	return "Hola mundo";
	}
	return "no se pudo";
}
}
