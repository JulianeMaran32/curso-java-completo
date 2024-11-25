package maran.java.base.oo;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		
		if(ligarTurbo && !ligarAr) { 		// ligado && desligado
			return 35;
		} else if(ligarTurbo && ligarAr) {	// ligado && ligado
			return 30;
		} else if(!ligarTurbo && ligarAr) {	// desligado && ligado
			return 10;	
		} else {							// desligado && desligado
			return 15;
		}
		
	}
	
//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
	
}