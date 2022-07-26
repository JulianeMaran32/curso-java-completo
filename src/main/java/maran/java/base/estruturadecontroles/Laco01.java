package maran.java.base.estruturadecontroles;

public class Laco01 {
	
	public static void main(String[] args) {
		
		System.out.println("+-----+");
		System.out.println("| for |");
		System.out.println("+-----+");
		System.out.println();
		
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna <= linha; coluna++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
	}

}
