package maran.java.base.excecao;

public class ChecadaNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!");

	}
	
	// throw = lançar
	// exceção NÃO checada ou NÃO verificada
	static void geraErro1() throws RuntimeException {
		throw new RuntimeException("Ocorreu um erro #01!");	
	}
	
	// exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02!");
	}

}