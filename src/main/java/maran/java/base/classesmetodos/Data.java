package maran.java.base.classesmetodos;

/**
 * this: referênciar o objeto atual
 * @author juliane.maran
 *
 */
public class Data {
	
	// declarando variáveis
	int dia;
	int mes;
	int ano;
	
	Data() {
		this(1, 1, 1970); // chama o construtor abaixo
	}
	
	// construtor
	public Data(int dia, int mes, int ano) {
//		this(); // chama o primeiro construtor
		this.dia = dia; // variável de instância = parâmetro
		this.mes = mes;
		this.ano = ano;
	}
	
	// métodos
	String dataFormatada() {
		// está sendo executada a partir de uma instância
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(dataFormatada());
	}
	
	/*
	 * this pode ser utilizado independente do conflito de nomes
	 * acessar variável de instância
	 * referência o objeto que está sendo criado naquele momento
	 * this aponta para o objeto atual
	 * num método estático não tem como acessar o this
	 * o método estático está associado a classe e o this é uma das instância da classe 
	 * this pode ser utilizado com método, neste caso significa que estamos chamando um construtor, serve para chamar um outro construtor
	 */

}
