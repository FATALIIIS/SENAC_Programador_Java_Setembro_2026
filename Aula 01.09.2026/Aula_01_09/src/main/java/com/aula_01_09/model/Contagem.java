package main.java.com.aula_01_09.model;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class Contagem {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		int inicio,fim;
		try {
			do {
				inicio=Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite o número inicial:"));
				fim=Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite o número final:"));
				if(inicio>=fim) {
					JOptionPane.showMessageDialog(frame,"O número inicial não pode ser igual ou menor que o final.");
				}
			}while(inicio>=fim);
			String mensagem="";
			for (int i=inicio; i<=fim; i++) {
				mensagem+=i+" ";
			}
			JOptionPane.showMessageDialog(frame, mensagem);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame,"Número inválido!");
		}
	}

}
