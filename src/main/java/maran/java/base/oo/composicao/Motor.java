package maran.java.base.oo.composicao;

import lombok.Getter;
import lombok.Setter;

/**
 * relação 1 para 1
 * um carro tem um motor
 * @author juliane.maran
 *
 */
@Getter
@Setter
public class Motor {
	
	public Carro2 carro;
	public boolean ligado = false;
	public double fatorInjecao = 1;
	
	public Motor(Carro2 carro){
		this.carro = carro;
	}
	
	public int giros() {
		
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
		
	}
	
}