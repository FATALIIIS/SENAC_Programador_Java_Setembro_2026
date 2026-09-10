package main.java.com.aula_10_09.view;

import java.awt.Frame;

import javax.swing.JOptionPane;

import main.java.com.aula_10_09.model.Media;

public class TelaMedia {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		int opcao=0;
		Media media=new Media();
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog(frame,"1 Adicionar \n2 Calcular Média \n3 Maior e menor nota \n4 Sair"));
			switch(opcao) {
			case 1:{
				media.adicionar(Double.parseDouble(JOptionPane.showInputDialog(frame,"Digite a média:").replace(",",".")));
				JOptionPane.showMessageDialog(frame,media.getMedia());
				break;
			}
			case 2:{
				if(media.getMedia().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Não há médias para calcular, insira uma primeiro.");
				}else {
				JOptionPane.showMessageDialog(frame,"A média dos alunos é: "+media.calcularMedia());
				break;
			}
			}
			case 3:{
				JOptionPane.showMessageDialog(frame,"A maior média é: "+media.maior()+", e a menor média é: "+media.menor());
				break;
			}
			}
		}while(opcao!=4);
	}

}
