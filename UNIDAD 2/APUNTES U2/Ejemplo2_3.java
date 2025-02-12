package U2Ejemplos;
import java.util.Scanner;
public class Ejemplo2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
		
		Alumnos[]alumno = new Alumnos[3];
		
		for(int i=0; i<alumno.length; i++) {
			System.out.println("Ingresa el nombre del alumno:");
			String nom= cap.nextLine();
			System.out.println("Ingresa la matriucla:");
			String mat= cap.nextLine();
			System.out.println("Ingresa calif parcial 1:");
			String cali1= cap.nextLine();
			System.out.println("Ingresa calif parcial 2:");
			String cali2= cap.nextLine();
			System.out.println("Ingresa calif parcial 3:");
			String cali3= cap.nextLine();
			alumno[i]= new Alumnos(nom,mat,cali1,cali2,cali3);
		}
         for(int i=0;i<alumno.length;i++) {
        	 System.out.println(alumno[i].toString());
        	 
        	 Materia Materia = new Materia(alumno);
        	 System.out.println(Materia.getPromediogral());
         }
		
	}

}
