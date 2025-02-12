package U1Tareas;
import java.util.Date;

public class Empleo {
   private String Actividad;
   private String Nombre;
   private int Edad;
   private String Genero;
   
   Date fecha = new Date();
   
  

public String getGenero() {
	 if(Genero.equalsIgnoreCase("m"))
		   Genero="Masculino";
	   else
		   Genero="Femenino";
		   
	return Genero;
}



public void setGenero(String genero) {
	Genero = genero;
}



public void setNombre(String nvNombre ) {
	   this.Nombre=nvNombre;
   }
   
  
   
   public String getActividad() {
	return Actividad;
}



public void setActividad(String actividad) {
	Actividad = actividad;
}



public String getNombre() {
	return Nombre;
}



@SuppressWarnings("deprecation")
public int getEdad() {
	int año;
	año = fecha.getYear();
	Edad=año-Edad;
	return Edad;
}



public void setEdad(int nvEdad ) {
   }
   
 
   
   public String toString() {
	   String Cadena;
	   Cadena="Nombre="+this.Nombre+"Actividad="+this.Actividad+"Edad="+this.Edad+"Genero="+this.Genero;
	   return Cadena;
   }
}
