package maran.java.base.oo.encapsulamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
	
	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setIdade(idade);
		setSobrenome(sobrenome);		
	}

	// LER - Getter
	public int getIdade() {
		return idade;
	}

	// ALTERAR - Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	@Override
	public String toString() {
		return "Olá, eu sou a " + getNome() + 
				" e tenho " + getIdade() + " anos de idade.";
	}
	
}