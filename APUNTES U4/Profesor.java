package U4Ejemplos;

public class Profesor {

	private String id;
	private String profesor;
	private String nombre;
	
	public Profesor(String id, String profesor) {
		this.id = id;
		this.profesor = profesor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
