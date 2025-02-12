package U4Tareas;

public abstract class Producto {
	    String nombre;
	    double precio;

	    public Producto(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public abstract double calcularPrecio(int cantidad);
	
}
