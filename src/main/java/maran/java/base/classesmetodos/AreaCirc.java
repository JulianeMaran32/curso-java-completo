package maran.java.base.classesmetodos;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.14;
	
	AreaCirc(double raio) {
		this.raio = raio;
	}
	
	double area() {
//		return raio * raio * pi;
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}
