package U4Ejercicios;
import java.util.Scanner;
public class Ejercicio4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
		Estudiante es = new Estudiante ();
		Profesor pr = new Profesor ();
		Cpersona p = new Cpersona();
		
		p.menu();
		int n = cap.nextInt();
		if(n==1)
		es.capEs();
		else if(n==2)
		pr.CapPr();
		else if (n==4) {
	     System.out.println("Gracias por usar el sistema UAT");
	     System.out.println("Se cerrara el programa en breve");
	     java.lang.System.exit(-1);
		}
	}
}
