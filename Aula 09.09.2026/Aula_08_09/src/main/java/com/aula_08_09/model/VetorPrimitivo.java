package main.java.com.aula_08_09.model;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class VetorPrimitivo {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		int[] numeros=new int[5];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite o "+(1+i)+"º número:"));
		}
		for (int i : numeros) {
			JOptionPane.showMessageDialog(frame,i+"\n");
		}
	}

}
