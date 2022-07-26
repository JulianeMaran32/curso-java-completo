package maran.java.base.classesmetodos;

public class Produto {
	
	// declarando variáveis
	String nome;
	double preco;
	static double desconto = 0.25;
	
	// construtor
	Produto() {
	
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	// métodos
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
		
	float precoComDesconto2(double x) {
		return (float) (preco * (1 - desconto + x));
	}
	
	double precoComDescontoGerente(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}

}
