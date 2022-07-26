package maran.java.base.oo.composicao;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	
	// 1 cliente para n compras
	public final String nome;
	public final List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome){
		this.nome = nome;
	}
	
	public void addCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	public double valorTotal() {
		double total = 0;
		for(Compra compra : compras) {
			total += compra.valorTotal();
		}
		return total;
	}
	
}