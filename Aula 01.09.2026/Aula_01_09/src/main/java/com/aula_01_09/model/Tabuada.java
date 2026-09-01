package main.java.com.aula_01_09.model;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		int numero;
		try {
			numero=Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite um número:"));
			String mensagem="";
			for (int i=1; i<=10; i++) {
				mensagem+=numero+"x"+i+"="+numero*i+"\n";
			}
			JOptionPane.showMessageDialog(frame, mensagem);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame,"Número inválido!");
		}
	}

}
