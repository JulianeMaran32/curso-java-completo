package maran.java.base.exercicios;

public class ContagemFor {

	public static void main(String[] args) {
		
		System.out.println("+-----+");
		System.out.println("| for |");
		System.out.println("+-----+");
		System.out.println();
		
		System.out.println("contagem progressiva de 0 a 10");
		for(int x = 0; x <= 10; x++) {
			System.out.println(x);
		}
		
		System.out.println();
		
		System.out.println("contagem regressiva de 10 a 0");
		for(int x = 10; x >= 0; x--) {
			System.out.println(x);
		}
		
		System.out.println();
		
		System.out.println("contagem de 0 a 10 de 2 em 2");
		for(int x = 0; x <= 10; x += 2) {
			System.out.println(x);
		}
		
		
		
		
	}

}
