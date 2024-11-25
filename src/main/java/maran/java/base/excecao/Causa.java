package maran.java.base.excecao;

public class Causa {

	public static void main(String[] args) {
		
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getClass() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
	}

	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está NULO");
		}
		System.out.println(aluno.nome);
	}
	
}
