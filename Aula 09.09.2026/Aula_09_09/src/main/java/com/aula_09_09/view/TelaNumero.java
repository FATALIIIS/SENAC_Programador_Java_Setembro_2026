package main.java.com.aula_09_09.view;

import java.awt.Frame;

import javax.swing.JOptionPane;

import main.java.com.aula_09_09.model.Numero;

public class TelaNumero {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		int opcao=0;
		Numero numero=new Numero();
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog(frame,"1 Adicionar \n 2 Remover \n 3 Ordenar \n 4 Contar Pares e Ímpares \n 5 Sair"));
			switch(opcao) {
			case 1:{
				numero.adicionar(Integer.parseInt(JOptionPane.showInputDialog(frame,"Qual número você quer adicionar ?")));
				JOptionPane.showMessageDialog(frame,numero.getNumeros());
				break;
			}
			case 2:{
				if(numero.getNumeros().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Não há elementos para remover, insira um primeiro.");
				}else {
				numero.remover(Integer.parseInt(JOptionPane.showInputDialog(frame,"Qual número remover: "+numero.getNumeros()+"?")));
				JOptionPane.showMessageDialog(frame,numero.getNumeros());
				break;
			}
			}
			case 3:{
				numero.ordenar();
				JOptionPane.showMessageDialog(frame, numero.getNumeros());
				break;
			}
			case 4:{
				numero.pares();
				JOptionPane.showMessageDialog(frame,"Pares: "+numero.getPares()+", Impares: "+numero.getImpares());
				break;
			}
			}
		}while(opcao!=5);
	}
}
