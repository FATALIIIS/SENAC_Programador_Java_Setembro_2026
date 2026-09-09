package main.java.com.aula_08_09.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VetorPalavra {

	private List<String> palavras;
	
	public VetorPalavra() {
		this.palavras=new ArrayList<>();
	}
	
	public void adicionar(String palavra) {
		this.palavras.add(palavra);
	}
	
	public void remover(String palavra) {
		for (int i = 0; i < this.palavras.size(); i++) {
			if(this.palavras.get(i).equalsIgnoreCase(palavra)) {
				this.palavras.remove(i);
			}
		}
	}
	
	public int contarPalavra(String palavra) {
		int contador=0;
		for (String string : palavras) {
			if(string.equalsIgnoreCase(palavra)) {
				contador++;
		}
	}

	return contador;
	}

	public void ordenar() {
		Collections.sort(this.palavras,String.CASE_INSENSITIVE_ORDER);
	}
	
	public void letraMaisucula() {
		for (int i = 0; i < this.palavras.size(); i++) {
			this.palavras.set(i, this.palavras.get(i).substring(0,1).toUpperCase()+this.palavras.get(i).substring(1,this.palavras.get(i).length()).toLowerCase());
		}
	}

	public List<String> getPalavras() {
		return palavras;
	}
	
	
}
	