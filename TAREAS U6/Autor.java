package U6Tareas;

public class Autor {

	private String nombre;
	private int nacimiento;
	
	public Autor(String nombre, int nacimiento) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	
	
}
