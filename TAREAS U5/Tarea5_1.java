package U5Tareas;
import java.util.ArrayList;
import java.util.Scanner;
public class Tarea5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Empleado>empleado = new ArrayList<Empleado>();
		Scanner cap = new Scanner(System.in);

		try {
			System.out.println("Dame el nombre del empleado");
		    String n=cap.nextLine();
		    System.out.println("Dame la edad del empleado");
		    int n1 = cap.nextInt();
		    cap.nextLine();
		    System.out.println("Sexo del empleado (F/Femenino)(M/Masculino)");
		    String n2= cap.nextLine();
		    Empleado emp = new Empleado(n, n2, n1);
            empleado.add(emp);
            
		}catch(Comprobar e) {
			System.out.println("Error:"+e.getMessage());
			System.out.println("Edad no permitida:"+e.getNumero());
			
		}
		
		
		
	}

}
