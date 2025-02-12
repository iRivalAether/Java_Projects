package U2Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Ejemplos2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Libros> libros= new ArrayList<Libros>();
		Scanner cap = new Scanner(System.in);
		//-----PARTE UNO-------
		//tres objetos a la estructura // nombre del libro , numero del libros
        Libros lib= new Libros("El cuadro", 17);	
        Libros lib1= new Libros("Don quijote de la mancha", 21);
        Libros lib2= new Libros ("100 cuentos de Mario Bendetti",16);
        
		
		//crear iterator tipo libro
		Iterator<Libros>it= libros.iterator();
		//crear el ciclo while
		//declaran una variable de tipo Libros que le asignen el iterator invocando al metodo next
		//invoque al metodo para imprimir de la clase Libros
		
		//----------PARTE DOS-----------
		// Capture desde el teclado el nombre del libro que desea buscar el usuario si se encuentra en el array
		System.out.println("Que libro desea llevar?:");
		String l = cap.nextLine();
		while(it.hasNext()) {
			Libros f = it.next();
			if(l.equals(f))
				System.out.println("Se encontro el elemento:"+l);
			
			
		}
		// Mande a imprimir el nombre del libro u el numero de titulos disponibles que hay
		
		

	}

}
