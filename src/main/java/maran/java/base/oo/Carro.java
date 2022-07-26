package maran.java.base.oo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {

	protected int velocidadeAtual;
	private int delta = 5;
	public final int VELOCIDADE_MAXIMA;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}		
	}
	
	public void frear() {		
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}		
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "km/h.";
	}
	
}