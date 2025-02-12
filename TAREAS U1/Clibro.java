package U1Tareas;
import java.util.Scanner;
public class Clibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner cap = new Scanner(System.in);
         
		Tarea1_2 Libro1= new Tarea1_2();
		Tarea1_2 Libro2= new Tarea1_2();
		
		System.out.println("Ingresa el Nombre del libro 1");
		Libro1.Nombre=cap.nextLine();
		
		System.out.println("Ingresa el Autor del libro 1");
		Libro1.Autor=cap.nextLine();
		
		System.out.println("Ingresa el Genero del libro 1");
		Libro1.Genero=cap.nextLine();
		
		System.out.println("Ingresa el Color del libro 1");
		Libro1.Color=cap.nextLine();
	
		
		System.out.println("Ingresa el Nombre del libro 2");
		Libro2.Nombre1=cap.nextLine();
		
		System.out.println("Ingresa el Autor del libro 2");
		Libro2.Autor1=cap.nextLine();
		
		System.out.println("Ingresa el Genero del libro 2");
		Libro2.Genero1=cap.nextLine();
		
		System.out.println("Ingresa el Color del libro 2");
		Libro2.Color1=cap.nextLine();
		
		
		if(Libro2.Genero1==Libro1.Genero|| Libro2.Autor1==Libro1.Autor) 
			Libro1.relacion();
		
			else
				Libro2.norelacion();
		
	}

}
