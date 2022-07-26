package maran.java.base.oo.composicao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
	
	public double preco;
	public String nome;
	
	public Produto(double preco, String nome) {
		this.preco = preco;
		this.nome = nome;
	}
	
}