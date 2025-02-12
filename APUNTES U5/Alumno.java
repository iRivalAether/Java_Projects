package U5Ejemplos;

public class Alumno {

	private String nombre;
	private String carrera;
	private int id;
	
	public Alumno(String nombre, String carrera, int id) throws Negativo {
		super();
		this.nombre = nombre;
		this.carrera = carrera;
		this.setId(id);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws Negativo {
		if(id>0)
		this.id = id;
		else 
			throw new Negativo("Valor no valido",id);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", carrera=" + carrera + ", id=" + id + "]";
	}
	
	
	
	
}
