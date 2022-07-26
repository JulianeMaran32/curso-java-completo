package maran.java.base.excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
//		imprimirNomeDoAluno(a1);		// java.lang.NullPointerException: aluno é null
		
		try {
			imprimirNomeDoAluno(a1);			
		} catch (Exception e) {
			System.out.println("Ocorreu o erro " + e);	// java.lang.NullPointerException: aluno é null
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
//			e.printStackTrace();			// java.lang.ArithmeticException: / by zero
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}	
		
		System.out.println("Fim :)");
		
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}