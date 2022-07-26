package maran.java.base.lambdas;

/**
 * métodos de uma interface são 'public abstract' 
 * @author juliane.maran
 *
 */
@FunctionalInterface
public interface Calculo {
	
	// função
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

}
