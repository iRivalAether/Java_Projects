package U4Ejemplos;

public class Jefatura extends Empleado{
	
	private double bono;

	public Jefatura(String id, String nombre, int edad, double pago, double bono) {
		super(id, nombre, edad, pago);
		this.bono = bono;
	}
	
	public double calcularPago() {
		return super.calcularPago()+this.bono;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Tu pago es:"+this.calcularPago();
	}
	
}

