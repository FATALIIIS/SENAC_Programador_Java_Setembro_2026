package main.java.com.aula_03_09.view;

import java.awt.Frame;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import main.java.com.aula_03_09.model.Aluno;

public class TelaAluno {

	public static void main(String[] args) {
		int opcao;
		Aluno aluno=new Aluno();
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog(frame,"1-Cadastrar Aluno \n 2-Calcular Média Final \n 3-Sair"));
			switch (opcao) {
			case 1: {
				aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite a matrícula:")));
				aluno.setNome(JOptionPane.showInputDialog(frame,"Digite o nome:"));
				aluno.setCurso(JOptionPane.showInputDialog(frame,"Digite o curso:"));
				aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog(frame,"Digite a primeira nota:").replace(",",".")));
				aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog(frame,"Digite a segunda nota:").replace(",",".")));
				JOptionPane.showMessageDialog(frame, "Matrícula: "+aluno.getMatricula()+"\n Nome: "+aluno.getNome()+"\n Curso: "+aluno.getCurso()+
				"\n Nota 1: "+aluno.getNota1()+"\n Nota 2: "+aluno.getNota2());
				break;
			}
			case 2: {
				DecimalFormat df=new DecimalFormat("##.0");
				JOptionPane.showMessageDialog(frame,"Para aluno "+aluno.getNome()+"Matrícula: "+aluno.getMatricula());
				JOptionPane.showMessageDialog(frame, "Nota 1: "+aluno.getNota1()+"Nota 2: "+aluno.getNota2()+"A média fica: "+
				df.format(aluno.mediaFinal()));
				break;							
			} 
				
		}
	}while(opcao!=3);

}

}