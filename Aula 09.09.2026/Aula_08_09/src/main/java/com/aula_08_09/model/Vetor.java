package main.java.com.aula_08_09.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Vetor {

	private ArrayList<Integer> numeros;
	
	public Vetor() {
		this.numeros=new ArrayList<>();
	}
	public void adicionar(int numero) {
		this.numeros.add(numero);
	}
	public void remover(int numero) {
		this.numeros.remove(this.numeros.indexOf(numero));
	}
	public void ordenar() {
		Collections.sort(this.numeros);
	}
	public void ordemReversa() {
		Collections.sort(this.numeros,Collections.reverseOrder());
	}
	public int somar() {
		int soma=0;
		for (Integer numero : numeros) {
			soma+=numero;
		}
		return soma;
	}
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}
}
