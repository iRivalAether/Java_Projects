package U2Ejemplos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;
public class Ejemplos2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Libros>libros= new ArrayList<Libros>();
		Biblioteca valores = new Biblioteca(libros);
		Libros lib;
		String nombre="";
	    int num=0;
	   do {
		nombre=JOptionPane.showInputDialog("Ingresa el nombre del libro").trim();
		
	    if(!nombre.isEmpty()) {
		num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero del titulo"));
		//libros.add(new Libros(nombre,num));
		lib=new Libros(nombre,num);
		//valores.insertar(lib);
		//System.out.println("Se ingreso al array "+lib.getNombre());
		}
	   }while(!nombre.isEmpty());
	    
	    //ordenar de forma ascendente por numero de titulos
		//Collections.sort(libros, Comparator.comparingInt(Libros::getNtitulos));
		
		//for(Libros o:libros) {
		//	o.mostrar();	
		//	System.out.println();
		//}

	    valores.mostrar();
		
		
		
		
		
		//Realizar una investigacion de las formas para comparar el contenido 
		//de un arrraylist
		//Utilizar un comprador que no implemente interfaves para ordernar
		//valores tipo objetios que contiene atributos
		//de tal forma que ustedes puedan ordernar este ejemplo
		//por numero de titulos de menor a mayor 
	    // Tambien investigar y estudiar el metodo constructor 
		
		

	}

}
