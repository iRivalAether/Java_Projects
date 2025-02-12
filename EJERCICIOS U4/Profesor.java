package U4Ejercicios;
import java.util.Scanner;
public class Profesor extends Cpersona{

	private int id;
	private String nombre;
	private double salario;
	
	public void CapPr() {
		Scanner cap = new Scanner (System.in);
		System.out.println("Dame el Nombre del profesor que se registrara:");
		this.nombre = cap.nextLine();
		System.out.println("Dame el ID del profesor que se registrara:");
		this.id = cap.nextInt(); 
		System.out.println("Dame el salario que obtendra el profesor:");
		this.salario = cap.nextDouble();
	}
}
