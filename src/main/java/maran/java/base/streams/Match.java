package maran.java.base.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		var a1 = new Aluno("Ana", 7.1);
		var a2 = new Aluno("Luna", 6.1);	// não aprovado
		var a3 = new Aluno("Gui", 8.1);
		var a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));		// todos os aprovados
		System.out.println(alunos.stream().anyMatch(aprovado));		// algum aprovado
		System.out.println(alunos.stream().noneMatch(reprovado));	// nenhum reprovado

	}

}