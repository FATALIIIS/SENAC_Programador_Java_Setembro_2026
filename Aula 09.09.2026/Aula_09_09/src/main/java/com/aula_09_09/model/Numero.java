package main.java.com.aula_09_09.model;

import java.util.ArrayList;
import java.util.Collections;

public class Numero {

	private ArrayList<Integer> numeros;
	private int pares;
	private int impares;
	
	public Numero() {
		this.numeros=new ArrayList<>();
		this.pares=0;
		this.impares=0;
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
	public void pares() {
		for (Integer numero : numeros) {
			if(numero%2==0) {
				this.pares++;
			}else {
				this.impares++;
			}
		}
	}
	public int getPares() {
		return pares;
	}
	public int getImpares() {
		return impares;
	}
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}
	
}
