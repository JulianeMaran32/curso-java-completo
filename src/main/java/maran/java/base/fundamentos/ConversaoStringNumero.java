package maran.java.base.fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		System.out.println("+-------------------------+");
		System.out.println("| conversão número string |");
		System.out.println("+-------------------------+");
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		System.out.println(valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;
		System.out.println("Soma: " + soma);
		System.out.println("Méida: " + soma / 2);

	}

}
