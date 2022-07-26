package maran.java.base.fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("+-------------+");
		System.out.println("| Tipo String |");
		System.out.println("+-------------+");
		System.out.println();
				
		System.out.println("Olá pessoal".charAt(2));	// á
		
		String s = "Boa noite";
		
		System.out.println(s.concat("!"));	// concatrnação = Boa noite!
		System.out.println(s + "!");		// concatenação = Boa noite!		
		System.out.println(s.startsWith("Boa")); // true		
		System.out.println(s.toLowerCase().startsWith("boa")); // true
		System.out.println(s.toUpperCase().endsWith("NOITE")); // true
		System.out.println(s.length());	// tamanho da string = 9
		System.out.println(s.toLowerCase().equals("boa noite")); // comparação de igualdade = true
		System.out.println(s.equalsIgnoreCase("boa noite"));	 // comparação de igualdade e não leva em consideração se é maiúscula/minúscula = true
		
		var nome = "Rian";
		var sobrenome = "Maran";
		var idade = 34;
		var salario = 12334.899;
		
		System.out.println("Nome: " + nome + " | Sobrenome: " + sobrenome + " | Idade: " + idade + " | Salario: R$" + salario);
		
		String frase = String.format("O Senhor %s %s tem %d e recebe R$%.2f", nome, sobrenome, idade, salario);		
		System.out.println(frase);
		
		
	}

}