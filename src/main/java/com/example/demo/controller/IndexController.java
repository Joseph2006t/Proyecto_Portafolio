package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	@GetMapping("/") //aparecera esta funcion cuando en la pagina web, este en la ubicacion /, osea al iniciar la web
	public String Inicio(Model model) {
		model.addAttribute("titulo","Inicio");
		
		return "Index";
	}
	
	@GetMapping("/SobreMi") //aparecera esta funcion cuando en la pagina web, este en la ubicacion /SobreMi
	public String SobreMi(Model model) {
		model.addAttribute("titulo2","SobreMi");
		
		return "SobreMi";
	}
	@GetMapping("/Proyectos") //aparecera esta funcion cuando en la pagina web, este en la ubicacion /Proyectos
	public String Proyectos(Model model) {
		model.addAttribute("titulo3","Proyectos");
		return "Proyectos";
	}
	
	
	
	

}
