package maran.java.base.oo.abstrato;

/**
 * só é possível ter método abstrato em classe abstrata, como se estivesse inacabada.
 * @author juliane.maran
 *
 */
public abstract class Animal {

	public String respirar() {
		return "CO2";
	}
	
	public abstract String mover();
	
}