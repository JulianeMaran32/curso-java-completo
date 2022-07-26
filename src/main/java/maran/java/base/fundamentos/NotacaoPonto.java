package maran.java.base.fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		System.out.println("+---------------+");
		System.out.println("| Notação ponto |");
		System.out.println("+---------------+\n");
		
//		double a = 2.3;				// tipo primitivo e reservado - não é possível untilizar a notação ponto como nos exemplos a baixo
		String s = "Boa noite X";	// tipo não primitivo e não reservado
		
//		s.toUpperCase();			// converte a letra em maiúsculo - não altera o valor original
//		s = s.replace("X", "Senhora"); // substitui um pelo outrob                                      
//		s = s.toUpperCase();		// dessa forma é armazenado o valor e conseguimos fazer a conversão		
//		s = s.concat("!!!");
		s = s.replace("X", "Senhora")
				.toUpperCase()
				.concat("!!!");
		System.out.println(s);
		
		String x = "Rian"
				.toUpperCase();
		System.out.println(x);
		
		String y = "Boa noite X"
				.replace("X", "Suzi");
		System.out.println(y);
			
		
	}

}
