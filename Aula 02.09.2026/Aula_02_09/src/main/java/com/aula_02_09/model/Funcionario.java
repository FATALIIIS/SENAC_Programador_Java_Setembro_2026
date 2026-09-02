package main.java.com.aula_02_09.model;

import java.time.LocalDate;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private int horast;
	private double valorh;
	private int desconto;
	private LocalDate datanasci;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorast() {
		return horast;
	}
	public void setHorast(int horast) {
		this.horast = horast;
	}
	public double getValorh() {
		return valorh;
	}
	public void setValorh(double valorh) {
		this.valorh = valorh;
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public LocalDate getDatanasci() {
		return datanasci;
	}
	public void setDatanasci(LocalDate datanasci) {
		this.datanasci = datanasci;
	}
	
	public double salarioBruto() {
		return this.valorh*this.horast;
	}
	
	public double salarioLiquido(double salarioBruto) {
		return salarioBruto-((this.desconto/100)*salarioBruto);
	}
		
}
