package U4Practicas;

public abstract class Figura1 {

	private double base;
	private double altura;
	private double radio;
	private double lado;
	
	public Figura1(double base, double altura, double radio, double lado) {
		super();
		this.base = base;
		this.altura = altura;
		this.radio = radio;
		this.lado = lado;
	}
	
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	public double getRadio() {
		return radio;
	}
	public double getLado() {
		return lado;
	}

	
	public abstract double Formula();
	

	
	
	
}
