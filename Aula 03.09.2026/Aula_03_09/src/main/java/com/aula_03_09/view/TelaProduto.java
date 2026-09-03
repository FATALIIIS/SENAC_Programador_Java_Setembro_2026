package main.java.com.aula_03_09.view;

import java.awt.Frame;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import main.java.com.aula_03_09.model.Produto;

public class TelaProduto {

	public static void main(String[] args) {
		int opcao;
		Produto produto=new Produto();
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog(frame,"1-Cadastrar Produto \n 2-Calcular Total do Produto \n 3-Sair"));
			switch (opcao) {
			case 1: {
				produto.setNome(JOptionPane.showInputDialog(frame,"Digite o nome do produto:"));
				produto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite o código:")));
				produto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite a quantidade:")));
				produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog(frame,"Digite o preço:").replace(",",".")));
				JOptionPane.showMessageDialog(frame, "Nome: "+produto.getNome()+"\n Código: "+produto.getCodigo()+"\n Quantidade: "+produto.getQuantidade()+
						"\n Preço: "+produto.getPreco());
				break;
			}
			case 2: {
				JOptionPane.showMessageDialog(frame,"Para produto "+produto.getNome());produto.setQuantidade(Integer.parseInt(
				JOptionPane.showInputDialog(frame,"Digite a quantidade do produto:")));
				DecimalFormat df=new DecimalFormat("#,###.00");
				JOptionPane.showMessageDialog(frame, produto.getNome()+":\n"+"Preço(R$)"+df.format(produto.getQuantidade())+"\n Quantidade  o total fica R$"+
				df.format(produto.calcularTotal()));
				break;							
			} 
				
		}
	}while(opcao!=3);

}

}