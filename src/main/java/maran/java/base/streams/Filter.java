package maran.java.base.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		var a1 = new Aluno("Suzi", 7.8);
		var a2 = new Aluno("Rian", 5.8);
		var a3 = new Aluno("Luna", 9.8);
		var a4 = new Aluno("Layla", 6.8);
		var a5 = new Aluno("Meg", 7.1);
		var a6 = new Aluno("Bob", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + ", você foi aprovado(a)!";
		
		// filtrar os alunos que foram aprovados
		alunos.stream()
			.filter(aprovado)		// filtro
			.map(saudacaoAprovado)	// mapeamento
			.forEach(System.out::println);

	}

}