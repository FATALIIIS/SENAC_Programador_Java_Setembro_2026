package main.java.com.aula_08_09.view;

import java.awt.Frame;

import javax.swing.JOptionPane;

import main.java.com.aula_08_09.model.VetorPalavra;

public class TelaVetorPalavras {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		VetorPalavra palavras=new VetorPalavra();
		int opcao=0;
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog(frame,"1 Inserir \n2 Remover \n3 Ordenar \n4 Contar Palavras \n5 Maísculas \n6 Sair"));
			switch(opcao) {
			case 1:{
				palavras.adicionar(JOptionPane.showInputDialog(frame,"Digite uma palavra:"));
				JOptionPane.showMessageDialog(frame, palavras.getPalavras());
				break;
			}
			case 2:{
				if(palavras.getPalavras().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "Insira alguma palavra primeiro.");
				}else {
					palavras.remover(
						JOptionPane.showInputDialog(frame, "Qual palavra remover: "+palavras.getPalavras()+"?"));
						JOptionPane.showMessageDialog(frame, palavras.getPalavras());
					}
				break;
				}
			case 3:{
				palavras.ordenar();
				JOptionPane.showMessageDialog(frame, palavras.getPalavras());
				break;
			}
			case 4:{
				int contador=palavras.contarPalavra(JOptionPane.showInputDialog(frame,"Qual palavra do vetor para contar ?"));
				JOptionPane.showMessageDialog(frame,"A palavra apareceu "+contador+" vezes!");
				break;
			}
			case 5:{
				palavras.letraMaisucula();
				JOptionPane.showMessageDialog(frame, palavras.getPalavras());
			}
			}
		}while(opcao!=6);
	}

}
