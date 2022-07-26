package maran.java.base.oo.heranca;

/**
 * Monstro herda de jogador
 * @author juliane.maran
 *
 */
public class Monstro extends Jogador {
	
	public Monstro() {
		this(0, 0);
	}
	
	public Monstro(int x, int y){
		super(x, y);
	}
	
}