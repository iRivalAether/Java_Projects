package U4Ejemplos;

public class Administrativo extends Empleado {
	
	
	private int horas;

	public Administrativo(String id, String nombre, int edad, double pago, int horas) {
		super(id, nombre, edad, pago);
		this.horas = horas;
	}

	@Override
	public double calcularPago() {
		// TODO Auto-generated method stub
		return super.calcularPago()*this.horas;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Tu pago es:"+this.calcularPago();
	}
	
	

}