package U1Ejemplos;

public class Empleo {
   private String Actividad;
   private String Nombre;
   private int Edad;
   
   
   
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



public int getEdad() {
	return Edad;
}



public void setEdad(int nvEdad ) {
	   if(nvEdad<=0)
		   this.Edad=18;
	   else
		   this.Edad=nvEdad;
   }
   
   public void setActivo(boolean Activo) {
	   
   }
   
   
   public String toString() {
	   String Cadena;
	   Cadena="Nombre="+this.Nombre+"Actividad="+this.Actividad+"Edad="+this.Edad;
	   return Cadena;
   }
}
