package U4Tareas;

public class Papas extends Producto {
    public Papas() {
        super("Papas", 40);
    }

    @Override
    public double calcularPrecio(int cantidad) {
        return precio * cantidad;
    }
}
