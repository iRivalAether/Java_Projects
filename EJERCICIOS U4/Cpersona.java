package U4Ejercicios;
import java.util.ArrayList;
public class Cpersona {

	private int id;
	private String nombre;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void menu() {

		System.out.println("Selecciona la accion que quieras hacer:");
		System.out.println("1. Registar Estudiante");
		System.out.println("2. Registrar Profesor");
		System.out.println("3. Mostrar");
		System.out.println("4. Salida");
		
	}
	
}
