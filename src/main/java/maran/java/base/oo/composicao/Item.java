package maran.java.base.oo.composicao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {

	// n itens para 1 produto
	public final int qtde;
	public final Produto produto;
		
	// quantos itens de determinado produto foram comprados
	public Item(Produto produto, int qtde){
		this.produto = produto;
		this.qtde = qtde;
	}

}