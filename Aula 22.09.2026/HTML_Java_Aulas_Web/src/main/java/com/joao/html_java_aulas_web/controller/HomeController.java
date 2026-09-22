package com.joao.html_java_aulas_web.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
	
	@GetMapping("/idade")
	public String comparar(
		@RequestParam(name="idadeh1",required=false) Integer idadeh1,
		@RequestParam(name="idadeh2",required=false) Integer idadeh2,
		@RequestParam(name="idadem1",required=false) Integer idadem1,
		@RequestParam(name="idadem2",required=false) Integer idadem2,
		Model model
	) {
		
	if(idadeh1!=null && idadeh2!=null && idadem1!=null && idadem2!=null) {
		if(idadeh1==idadeh2 || idadem1==idadem2) {
			String resposta="Há idades iguais!";
			model.addAttribute("resposta",resposta);
		}else{
			int maisvelho=(idadeh1>idadeh2)?idadeh1:idadeh2;
			int maisnova=(idadem1<idadem2)?idadem1:idadem2;
			int soma=maisvelho+maisnova;
			model.addAttribute("maisvelho",maisvelho);
			model.addAttribute("maisnova",maisnova);
			model.addAttribute("soma",soma);
		}
	}
	return "idade";
}
	
	@GetMapping("/posto")
	public String calcular(
		@RequestParam(name="litros",required=false) Integer litros,
		@RequestParam(name="combustivel",required=false) String combustivel,
		Model model
	) {
		
	if(litros!=null && combustivel!=null){
		double total=0;
		double preco=0;
		double desconto=0;
		if(combustivel.equalsIgnoreCase("gasolina")) {
			preco=6.33;
			if(litros<=20) {
				desconto=4.0/100;
			}else{
				desconto=6.0/100;
			}
		}else {
			preco=3.96;
			if(litros<=20) {
				desconto=3.0/100;
			}else{
				desconto=5.0/100;
			}
		}
		total=litros*preco;
		total=total-(total*desconto);
		DecimalFormat df=new DecimalFormat("#,###.00");
		model.addAttribute("total",df.format(total));
		model.addAttribute("combustivel",combustivel);
	}
	return "posto";
	}
	
	@GetMapping("/ordenar")
	public String ordenar(
			@RequestParam(name="numero1",required=false) Integer numero1,
			@RequestParam(name="numero2",required=false) Integer numero2,
			@RequestParam(name="numero3",required=false) Integer numero3,
			Model model
	) {
		
	if(numero1!=null && numero2!=null && numero3!=null)
		if(numero1==numero2||numero1==numero3||numero2==numero3) {
			String resultado="Os números são iguais, digite novamente.";
			model.addAttribute("resultado",resultado);
		}else{
			List<Integer>numeros=new ArrayList<>();
			numeros.add(numero1);numeros.add(numero2);numeros.add(numero3);
			Collections.sort(numeros,Collections.reverseOrder());
			model.addAttribute("ordem",numeros);
		}
	
		
	return "ordenar";
	}
}
