package U2Ejemplos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Biblioteca {
	//declarar un arraylist private tipo libros
	private ArrayList<Libros>lib;
	private int ntotal=0;
    int pos;
	//crear metodo constructor donde construyan el arraylist
	public Biblioteca(ArrayList<Libros> lib) {
		this.lib=lib;
		pos=-1;
		 for(Libros e : lib) {
	    	  e.getNombre();
	    	  ntotal=ntotal+1;
	    	  Integer sum = 0;
	    	   for (Object obj : lib) {
	               if (obj instanceof Integer) {
	                   sum += (Integer) obj;
	               }
	    	   }
		 }
	      }
		 
		 public void insertar(Libros datos) {
			 pos++;
			 lib.add(datos);
		 }
		 //metodo imprimir
		 
		
		 public void titulos(Libros Ntitulos) {
			Comparator<Libros> compa=Comparator.comparingInt(Libros::getNtitulos);
			Collections.sort(lib,compa);
			
		 }
		 public void Ltitulos() {
		
		 }
		 public void mostrar() {
			 System.out.println();
				//metodo listado de titulos de libros
				 //metodo ordernar por numero de titulo
		}
}

