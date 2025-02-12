package U4Tareas;

public class Nuggets extends Producto {
	  public Nuggets() {
	        super("Nuggets", 50);
	    }

	    @Override
	    public double calcularPrecio(int cantidad) {
	        return precio * cantidad;
	    }
	}