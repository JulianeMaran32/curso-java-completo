package maran.java.base.exercicios;

public class Tabuada {

	public static void main(String[] args) {
		
		System.out.println("Laço de repetição: for");
		
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int contador = 0; contador <= 10; contador++) {
				System.out.println("multiplicador * contador = " + (multiplicador * contador));
//				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
