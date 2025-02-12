package U4Tareas;

public class Malteada extends Producto {

	public Malteada(){
		super("Malteada", 35);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio(int cantidad) {
		// TODO Auto-generated method stub
		return precio * cantidad;
	}

}
