package U3Ejercicios;
import java.util.Scanner;
public class Ejercicio3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
        Agenda agenda = new Agenda();
    
        
        System.out.println("Nombre de la mascota que desea adoptar:");
        agenda.setNombre(cap.nextLine().trim());
        System.out.println("Raza de la mascota:");
        agenda.setRaza(cap.nextLine().trim());
        System.out.println("Edad de la mascota:");
        agenda.setEdad(cap.nextInt());
        cap.nextLine();
        
        
        
        
	}

}
