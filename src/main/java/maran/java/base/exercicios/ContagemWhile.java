package maran.java.base.exercicios;

public class ContagemWhile {

	public static void main(String[] args) {
		
		System.out.println("Contagem progressiva 0 a 10");
		int x = 0;
		while(x <= 10) {
			System.out.print(x + " ");
			x += 1;
		}
		
		System.out.println("\n");
		System.out.println("Contagem regressiva 10 a 0");
		int k = 10;
		while(k >= 0) {
			System.out.print(k + " ");
			k--;
		}
		System.out.println("\n");
		System.out.println("Contagem -5 a +5, de 2 em 2");
		int z = -5;
		while(z <= 5) {
			System.out.print(z + " ");
			z += 2;
		}

	}

}