package maran.java.base.oo.composicao;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Compra {
	
	// 1 compra para n itens
	public final List<Item> itens = new ArrayList<>();
	public String cliente;
	
	public void addItem(Produto produto, int qtde) {
		this.itens.add(new Item(produto, qtde));
	}
	
	public void addItem(String nome, double preco, int qtde) {
		var produto = new Produto(preco, nome);
		this.itens.add(new Item(produto, qtde));
	}
	
	public double valorTotal() {
		double total = 0;
		for(Item item : itens) {
			total += item.qtde * item.produto.preco;
		}
		return total;
	}

	public void addItem(Item item) {
		// TODO Auto-generated method stub
		
	}

}