package maran.java.base.oo.composicao;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso {
	
	public final String nome;
	public final ArrayList<Aluno> alunos = new ArrayList<>();
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	// relação bidirecional
	public void addAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

}