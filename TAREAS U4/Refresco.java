package U4Tareas;

public class Refresco extends Producto {

    public Refresco() {
        super("Refresco", 25);
    }

    @Override
    public double calcularPrecio(int cantidad) {
        return precio * cantidad;
    }
}
