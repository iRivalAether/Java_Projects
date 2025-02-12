package U4Practicas;

public class Cuadrado1 extends Figura1 {

	public Cuadrado1(double base, double altura, double radio, double lado) {
		super(base, altura, radio, lado);
		// TODO Auto-generated constructor stub
	}

	public double Formula() {
		// TODO Auto-generated method stub
		return this.getLado()*this.getLado();
	}

}
