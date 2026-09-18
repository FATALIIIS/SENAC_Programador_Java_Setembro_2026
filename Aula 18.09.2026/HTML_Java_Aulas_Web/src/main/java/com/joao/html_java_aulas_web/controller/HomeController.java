package com.joao.html_java_aulas_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/calculadora")
	public String calcular(
			@RequestParam(name = "numero1",required = false) Integer numero1,
			@RequestParam(name = "numero2",required = false) Integer numero2,
			@RequestParam(name = "operacao",required = false) String operacao,
	Model model
			) {
	if(numero1!=null&&numero2!=null) {
		int resultado=0;
		switch (operacao) {
		case "+":
			resultado=numero1+numero2;
			break;
		case "-":
			resultado=numero1-numero2;
			break;
		case "×":
			resultado=numero1*numero2;
			break;
		case "÷":
			resultado=numero1/numero2;
			break;
		}
		model.addAttribute("numero1",numero1);
		model.addAttribute("numero2",numero2);
		model.addAttribute("operacao",operacao);
		model.addAttribute("resultado",resultado);
	}
	return "calculadora";
	}
}
