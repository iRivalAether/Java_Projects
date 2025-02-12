package U4Tareas;

public class Hamburguesa extends Producto {

	public Hamburguesa() {
        super("Hamburguesa", 120);
    }

    @Override
    public double calcularPrecio(int cantidad) {
        return precio * cantidad;
    }
}
