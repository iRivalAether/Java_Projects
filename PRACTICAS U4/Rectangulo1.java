package U4Practicas;

public class Rectangulo1 extends Figura1 {

	public Rectangulo1(double base, double altura, double radio, double lado) {
		super(base, altura, radio, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Formula() {
		// TODO Auto-generated method stub
		return this.getBase()*this.getAltura();
	}

}
