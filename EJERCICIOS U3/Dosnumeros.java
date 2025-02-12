package U3Ejercicios;
import java.util.Scanner;
public class Dosnumeros {
	 private int n1;
	   private int n2;
	   private int mayor;
	   private int sumatoria;
	   private boolean continuar;
	   Scanner cap = new Scanner(System.in);

	   public Dosnumeros() {
	       this.continuar = true;
	       this.cap = new Scanner(System.in);
	   }

	   public void capN() {
	       System.out.println("Ingrese dos números:");
	       this.n1 = cap.nextInt();
	       this.n2 = cap.nextInt();
	   }

	   public void DM() {
	       if (n1 > n2) {
	           this.mayor = n1;
	       } else {
	           this.mayor = n2;
	       }
	   }

	   public void ITM() {
	       System.out.println("Tabla de multiplicar de " + mayor);
	       for (int i = 1; i <= 10; i++) {
	           System.out.println(mayor + " x " + i + " = " + (mayor * i));
	       }
	   }

	   // public static tipo de datos, nombre
	   // public static double numeros;
	   // puedo llamarlos normal
	   // DESDE LA MISMA CLASE//
	   // variable
	   // metodo()
	   
	   // this.variable
	   // metodo
	   // no se puede instaciar, ejemplo this.nombre
	   public int S() {
	       this.sumatoria = 0;
	       for (int i = 1; i <= 10; i++) {
	           sumatoria = sumatoria+mayor * i;
	       }
	       return sumatoria;
	   }

	   public void IS() {
	       System.out.println("La sumatoria de los números generados de la tabla de multiplicar es: " + sumatoria);
	   }

	   public void IPI() {
	       if (sumatoria % 2 == 0) {
	           System.out.println("El resultado de la sumatoria es par");
	       } else {
	           System.out.println("El resultado de la sumatoria es impar");
	       }
	   }

	   public void preguntarContinuar() {
	       System.out.println("¿Desea continuar? (s/n)");
	       String respuesta = cap.next();
	       if (respuesta.equalsIgnoreCase("n")) {
	           this.continuar = false;
	       }
	   }

	   public void mostrar() {
	       while (continuar) {
	           capN();
	           DM();
	           ITM();
	           S();
	           IS();
	           IPI();
	           preguntarContinuar();
	       }
	   }
}
