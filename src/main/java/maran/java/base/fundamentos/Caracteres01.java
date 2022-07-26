package maran.java.base.fundamentos;

public class Caracteres01 {
	
	public static void main(String[] args) {
		
		System.out.println("+------------+");
		System.out.println("| Caracteres |");
		System.out.println("+------------+");
		
		
		
		char letra = 'a';
        System.out.println(letra);

        char valor = 65;                    // Compila!
        System.out.println(valor);

        valor = (char) (valor + 1);         // Não compila!
        System.out.println(valor);

        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);

        palavra = palavra + 2022;
        System.out.println(palavra);
		
		
		
	}

}
