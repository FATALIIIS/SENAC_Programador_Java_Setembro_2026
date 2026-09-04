package main.java.com.aula_04_09.model;

public class Estacionamento {

	private int vaga;
	private String carro;
	private String placa;
	private double valorhora;
	private int horas;
	public int getVaga() {
		return vaga;
	}
	public void setVaga(int vaga) {
		this.vaga = vaga;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getValorhora() {
		return valorhora;
	}
	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double calcularTotal() {
		return this.valorhora*this.horas;
	}
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}
	
}
