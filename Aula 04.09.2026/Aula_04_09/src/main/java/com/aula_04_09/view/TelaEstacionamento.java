package main.java.com.aula_04_09.view;

import java.awt.Frame;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import main.java.com.aula_04_09.model.Estacionamento;

public class TelaEstacionamento {

	public static void main(String[] args) {
		int opcao;
		Estacionamento estacionamento=new Estacionamento();
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog(frame,"1-Cadastrar Veículo \n2-Valor a ser pago \n3-Sair"));
			switch (opcao) {
			case 1: {
				estacionamento.setCarro(JOptionPane.showInputDialog(frame,"Digite o modelo do carro:"));
				estacionamento.setVaga(Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite a vaga:")));
				estacionamento.setPlaca(JOptionPane.showInputDialog(frame,"Digite a placa:"));
				estacionamento.setValorhora(Double.parseDouble(JOptionPane.showInputDialog(frame,"Digite o valor da hora:")));
				estacionamento.setHoras(Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite as horas:")));
				JOptionPane.showMessageDialog(frame, "\n Carro: "+estacionamento.getCarro()+"\n Vaga: "+estacionamento.getVaga()+"\n Placa: "+estacionamento.getPlaca()+"\n Valor Hora: "+"R$"+estacionamento.getValorhora()+
				"\n Tempo Total: "+estacionamento.getHoras());
				break;
			}
			case 2: {
				DecimalFormat df=new DecimalFormat("##.0");
				JOptionPane.showMessageDialog(frame,"Para o carro '"+estacionamento.getCarro()+"'\nPlaca: "+estacionamento.getPlaca());
				JOptionPane.showMessageDialog(frame, "\n Valor Hora: R$"+estacionamento.getValorhora()+"\n Tempo Total: "+estacionamento.getHoras()+" Horas"+"\n Valor Final: R$"+
				df.format(estacionamento.calcularTotal()));
				break;							
			} 
				
		}
	}while(opcao!=3);

}

}