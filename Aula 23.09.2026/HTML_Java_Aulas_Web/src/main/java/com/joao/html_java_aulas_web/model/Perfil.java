package com.joao.html_java_aulas_web.model;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.format.annotation.DateTimeFormat;

public class Perfil {
	
	private String nome;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate datanasci;
	private String corfundo;
	private String cortexto;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDatanasci() {
		return datanasci;
	}
	public void setDatanasci(LocalDate datanasci) {
		this.datanasci = datanasci;
	}
	public String getCorfundo() {
		return corfundo;
	}
	public void setCorfundo(String corfundo) {
		this.corfundo = corfundo;
	}
	public String getCortexto() {
		return cortexto;
	}
	public void setCortexto(String cortexto) {
		this.cortexto = cortexto;
	}
	
	public void randomizar() {
		Random random=new Random();
		while(this.cortexto.equalsIgnoreCase(corfundo)) {
			int corint=random.nextInt(0x1000000);
			this.corfundo=String.format("#%06X",corint);
		}
	}
}
