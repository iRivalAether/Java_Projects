package U1Tareas;
import java.util.Scanner;
public abstract class Tarea1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
		
		Empleo emp1 = new Empleo();
		
		System.out.println("NOMBRE DEL EMPLEADO:");
		emp1.setNombre(cap.nextLine().trim());
		System.out.println("ACTIVIDAD DEL EMPLEADO:");
		emp1.setActividad(cap.nextLine().trim());
		System.out.println("AÑO DE NACIMIENTO:");
		emp1.setEdad(cap.nextInt());
		cap.nextLine();
		System.out.println("GENERO DEL EMPLEADO:");
		emp1.setGenero(cap.nextLine().trim());
		
		System.out.println(emp1.toString());
		

	}

}
