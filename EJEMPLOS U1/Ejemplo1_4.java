package U1Ejemplos;
import java.util.Scanner;
public class Ejemplo1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner cap = new Scanner(System.in);
        
		Materia mat1= new Materia();
		
		
		System.out.println("Ingresa el nombre de la materia:");
		mat1.setNombre(cap.nextLine().trim());
		System.out.println("Ingresa el numero de estudiantes:");
		mat1.setNestudiantes(cap.nextInt());
		System.out.println("Ingresa el grupo:");
		mat1.setGrupo(cap.next().charAt(0));
		cap.nextLine();
		System.out.println("Ingresa el periodo:  (primavera,verano o otoño)");
		mat1.setPeriodo(cap.nextLine().trim());
		
		System.out.println(mat1.toString());
	
	}

}
