package maran.java.base.oo.polimorfismo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PessoaPoli {
	
	private double peso;
	
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}		
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

}
