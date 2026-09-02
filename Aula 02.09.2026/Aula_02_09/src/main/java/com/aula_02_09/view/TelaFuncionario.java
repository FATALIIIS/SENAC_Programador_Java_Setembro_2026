package main.java.com.aula_02_09.view;

import java.awt.Frame;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import main.java.com.aula_02_09.model.Funcionario;

public class TelaFuncionario {

	public static void main(String[] args) {
		int opcao;
		Funcionario funcionario=new Funcionario();
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		DateTimeFormatter formatador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog(frame,"1-Cadastrar Funcionário \n 2-Calcular Salário \n 3-Sair"));
			switch (opcao) {
			case 1: {
				funcionario.setNome(JOptionPane.showInputDialog(frame,"Digite o nome do funcionário:"));
				funcionario.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite a matrícula:")));
				funcionario.setHorast(Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite as horas trabalhadas:")));
				funcionario.setValorh(Double.parseDouble(JOptionPane.showInputDialog(frame,"Digite o valor da hora trabalhada:").replace(",",".")));
				String datas=JOptionPane.showInputDialog(frame,"Digite a data de nascimento:");
				funcionario.setDatanasci(LocalDate.parse(datas,formatador));
				JOptionPane.showMessageDialog(frame, "Nome: "+funcionario.getNome()+"\n Matricula: "+funcionario.getMatricula()+"\n Horas Trabalhadas: "+funcionario.getHorast()+
						"\n Valor Hora: "+funcionario.getValorh()+"\n Data de Nascimento: "+funcionario.getDatanasci());
				}
			}
		}
	}
}
