package U1Ejemplos;
import java.util.Scanner;
public class Ejemplo1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner cap= new Scanner(System.in);		
		
		Galleta galleta1= new Galleta();
		Galleta galleta2= new Galleta();
		
		System.out.println("Ingresa el tipo de galleta");
		galleta1.Tipo=cap.nextLine();
		
		System.out.println("Ingresa la forma de la galleta");
		galleta1.Forma=cap.nextLine();
		
		System.out.println("Ingresa el color de la galleta");
		galleta1.Color=cap.nextLine();
		
		galleta2.Color="Azul";
		galleta2.Forma="Redonda";
		galleta2.Tipo="Integral";
		
		galleta1.Forma=galleta2.Forma;
		System.out.println("La galleta1 tiene forma="+galleta1.Forma);
		galleta1.preparacion1();
		
		if(galleta1.Forma==galleta2.Forma)
			System.out.println("son iguales");
			else
				System.out.println("no son iguales");
	}

}
