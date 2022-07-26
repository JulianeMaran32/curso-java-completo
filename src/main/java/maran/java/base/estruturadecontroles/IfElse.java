package maran.java.base.estruturadecontroles;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		System.out.println("+---------+");
		System.out.println("| if else |");
		System.out.println("+---------+");
		System.out.println();
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("par");
		} else {	// numero % 2 == 1
			System.out.println("ímpar");
		}

	}

}
