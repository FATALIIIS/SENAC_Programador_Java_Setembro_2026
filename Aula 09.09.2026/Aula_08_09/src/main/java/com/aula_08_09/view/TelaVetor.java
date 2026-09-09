package main.java.com.aula_08_09.view;

import java.awt.Frame;

import javax.swing.JOptionPane;

import main.java.com.aula_08_09.model.Vetor;

public class TelaVetor {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		int opcao=0;
		Vetor vetor=new Vetor();
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog(frame,"1 Adicionar \n 2 Remover \n 3 Ordenar \n 4 Reversa \n 5 Somar \n 6 Sair"));
			switch(opcao) {
			case 1:{
				vetor.adicionar(Integer.parseInt(JOptionPane.showInputDialog(frame,"Qual número adicionar ?")));
				JOptionPane.showMessageDialog(frame,vetor.getNumeros());
				break;
			}
			case 2:{
				if(vetor.getNumeros().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Não há elementos para remover, insira um primeiro.");
				}else {
				vetor.remover(Integer.parseInt(JOptionPane.showInputDialog(frame,"Qual número remover: "+vetor.getNumeros()+"?")));
				JOptionPane.showMessageDialog(frame,vetor.getNumeros());
				break;
			}
			}
			case 3:{
				vetor.ordenar();
				JOptionPane.showMessageDialog(frame, vetor.getNumeros());
				break;
			}
			case 4:{
				vetor.ordemReversa();
				JOptionPane.showMessageDialog(frame, vetor.getNumeros());
				break;
			}
			case 5:{
				JOptionPane.showMessageDialog(frame,"A soma dos elementos é:"+vetor.somar());
				break;
			}
			}
		}while(opcao!=6);
	}

}
