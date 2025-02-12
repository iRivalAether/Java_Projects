package U4Practicas;

public class Circulo1 extends Figura1 {

	public Circulo1(double base, double altura, double radio, double lado) {
		super(base, altura, radio, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Formula() {
		// TODO Auto-generated method stub
		return this.getRadio()*this.getRadio()*Math.PI;
	}

}
