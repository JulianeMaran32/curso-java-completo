package maran.java.base.oo.polimorfismo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Comida {
	
	private double peso;
	
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}		
	}

}