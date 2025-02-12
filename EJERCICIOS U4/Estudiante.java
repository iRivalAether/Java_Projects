package U4Ejercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class Estudiante extends Cpersona {
	private int id;
	private String nombre;
	private double calif1;
	private double calif2;
	private double calif3;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void capEs () {
		Scanner cap = new Scanner(System.in);
		System.out.println("Dame el Nombre del estudiante que se registrara:");
	    this.nombre= cap.nextLine();
		System.out.println("Dame el ID del estudiante que se registrara:");
		this.id = cap.nextInt();
        System.out.println("Dame la calificacion del primer parcial del estudiante:");
        this.calif1 = cap.nextDouble();
        System.out.println("Dame la calificacion del segundo parcial del estudiante:");
        this.calif2 = cap.nextDouble();
        System.out.println("Dame la calificacion del tercer parcial del estudiante:");
        this.calif3 = cap.nextDouble();	
        }
}
