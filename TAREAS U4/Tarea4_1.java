package U4Tareas;
import java.util.Scanner;
public class Tarea4_1 {
	public static Producto[] productos;
	 public Tarea4_1() {
	        productos = new Producto[] {
	            new Hamburguesa(),
	            new Papas(),
	            new Refresco(),
	            new Malteada(),
	            new Nuggets()
	        };
	    }

		            
		public void mostrarMenu() {
		    System.out.println("Seleccione un producto:");
		    for (int i = 0; i < productos.length; i++) {
		     System.out.printf("%d. %s - $%.2f\n", i + 1, productos[i].nombre, productos[i].precio);
		                }
		}


		public void tomarPedido() {
		 Scanner scanner = new Scanner(System.in);
		 int totalCantidad = 0;
		 double totalPrecio = 0.0;

		      while (true) {
		      mostrarMenu();
		      System.out.print("Ingrese el número del producto que desea ordenar o 0 para finalizar: ");
		      int escoger = scanner.nextInt();

		      if (escoger==0) {
		                        break;
		                    }

		        if (escoger < 1 || escoger > productos.length) {
		                        System.out.println("Selección inválida.");
		                        continue;
		                    }

		                    System.out.print("Ingrese la cantidad: ");
		                    int cantidad = scanner.nextInt();

		                    double precio = productos;
		                