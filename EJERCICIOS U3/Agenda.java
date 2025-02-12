package U3Ejercicios;
import java.util.Date;
public class Agenda {
	Date f = new Date();
	private String nombre;
	private int edad;
	private String raza;
	private int fecha;
	private int Vejez;
	
    public void Vejez(int edad) {
    	if(edad>10)
    		System.out.println("Su mascota es de avanzada edad");
    	else if(edad>5)
    		System.out.println("Su mascota es de mediana edad");
    	else
    		System.out.println("Su mascota es de temprana edad");
    	this.edad=edad;
    }
	
   public void f() {
	   
	   fecha=f.getDay();
	   this.fecha=fecha;
   }
	public String getNombre(String nombre) {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad(int edad) {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRaza(String raza) {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getFecha(int fecha) {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public void mostrar() {
		System.out.println(this.getNombre(nombre));
		System.out.println(this.getRaza(raza));
		System.out.println(this.getEdad(edad));
		System.out.println(this.getFecha(fecha));
		
	}
 	
}
