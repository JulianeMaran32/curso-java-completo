package maran.java.base.oo.teste;

import maran.java.base.oo.heranca.DirecaoEnum;
import maran.java.base.oo.heranca.Heroi;
import maran.java.base.oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);

		
		System.out.println("Heroi: " + heroi.vida);
		System.out.println("Monstro: " + monstro.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(DirecaoEnum.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);		
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Heroi: " + heroi.vida);
		System.out.println("Monstro: " + monstro.vida);

	}

}
