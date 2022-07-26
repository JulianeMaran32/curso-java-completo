package maran.java.base.fundamentos;

public class Conversao01 {
	
	public static void main(String[] args) {
		
		System.out.println("+-----------+");
		System.out.println("| conversão |");
		System.out.println("+-----------+");
		
		// converte double para int
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println("Valor: " + valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println("Total: " + total);
		
	}

}
