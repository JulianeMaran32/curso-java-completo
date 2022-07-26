package maran.java.base.oo.composicao;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * final = o endereço de memória não pode mudar
 * a lista pode ser modificada
 * @author juliane.maran
 *
 */
@Getter
@Setter
public class Aluno {

	public final String nome;
	public final ArrayList<Curso> cursos = new ArrayList<>();
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public void addCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public Curso obterCursoPorNome(String nome) {
		for(Curso curso : this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {
		return nome;
	}
	
}
