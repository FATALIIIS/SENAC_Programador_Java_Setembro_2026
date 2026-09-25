package com.joao.html_java_aulas_web.model;

public class Poupança {

	private String titular;
	private double saldo;
	private double taxa;
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double calcularJuros(){
		return this.saldo*Math.pow((1+this.taxa),6);
	}
}
