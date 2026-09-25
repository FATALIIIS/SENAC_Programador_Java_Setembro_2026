package com.joao.html_java_aulas_web.model;

public class Aluno {

	private String nome;
	private double peso;
	private double altura;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double calculaImc() {
		return this.peso/(this.altura*this.altura);
	}
	public String classificar(double imc) {
		if(imc<18.5) {
			return "Baixo Peso";
		}else if(imc>=18.5 && imc<=24.9) {
			return "Peso normal ou adequedo";
		}else if(imc>=25.0 && imc<=29.9) {
			return "Sobrepeso";
		}else if(imc>=30.0 && imc<=34.9) {
			return "Obesidade Grau I";
		}else if(imc>=35.0 && imc<=39.9) {
			return "Obesidade Grau II";
		}else {
			return "Obesidade Grau III (Grave)";
		}
	}
}
