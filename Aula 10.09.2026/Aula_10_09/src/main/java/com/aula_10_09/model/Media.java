package main.java.com.aula_10_09.model;

import java.util.ArrayList;
import java.util.Collections;

public class Media {

	private ArrayList<Double> media;
	public Media() {
		this.media=new ArrayList<>();
	}
	
	public void adicionar(double media) {
		this.media.add(media);
	}
	
	public ArrayList<Double> getMedia() {
		return media;
	}
	
	public double calcularMedia() {
		double m=0;
		for (Double nota : media) {
			m+=nota;
		}
		m/=this.media.size();
		return m;
	}
	public double maior() {
		return Collections.max(this.media);
	}
	public double menor() {
		return Collections.min(this.media);
	}
	
}
