package U3Ejemplos;

public class Metodos2 {
	
	public static final double valorPI=3.1416;
	private static int figuras;
	private double radio;
	
	
	static {//inicializador de clases
		figuras=4;
	}
	
	
	public Metodos2(double radio) {
		this.radio = radio;
	}


	public double circulo() {
		return valorPI*this.radio*this.radio;
	}
	
	
	public static double triangulo(double b, double h) {
		double areat=b*h/2;
		return areat;
	}

	public static double rectangulo(double b, double h) {
		double arear=b*h;
		return arear;
	}
	
	
	
	
}
