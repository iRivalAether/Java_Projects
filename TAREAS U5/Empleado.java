package U5Tareas;

public class Empleado {

	private String nombre;
	private String sexo;
	private int edad;
	
	
	public Empleado(String nombre, String sexo, int edad) throws Comprobar {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.setEdad(edad);
			}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad)throws Comprobar {
		if((edad>17)&&(edad<31))
			this.edad = edad;
		else
			throw new Comprobar("Edad no admitida",edad);
			
	}
	
	
	
}
