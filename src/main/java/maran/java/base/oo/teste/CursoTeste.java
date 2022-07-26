package maran.java.base.oo.teste;

import maran.java.base.oo.composicao.Aluno;
import maran.java.base.oo.composicao.Curso;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("José");
		Aluno aluno4 = new Aluno("Rosa");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Web Completo");
		Curso curso3 = new Curso("Springboot");
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		curso2.addAluno(aluno3);
		curso3.addAluno(aluno4);
		
		aluno1.addCurso(curso3);
		aluno2.addCurso(curso2);
		
		for(Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome);
			System.out.println("e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
	}
	
}
