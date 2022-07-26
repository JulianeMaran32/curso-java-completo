package maran.java.base.estruturadecontroles;

public class For03 {

	public static void main(String[] args) {
		
		System.out.println("+-----+");
		System.out.println("| for |");
		System.out.println("+-----+");
		System.out.println();
		
		String valor = "#";
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// NÃO utilizar valores numéricos para controlar o laço
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}

	}

}
