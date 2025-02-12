package U1Ejemplos;
public class Tutorias {
    private String Nombre;
    private String Matricula;
    private String Carrera;
    public String Status;
    private int Semestre;
    private Profesor Tutor;
    
    
    
    
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getCarrera() {
		return Carrera;
	}
	public void setCarrera(String carrera) {
		Carrera = carrera;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getSemestre() {
		return Semestre;
	}
	public void setSemestre(int semestre) {
		Semestre = semestre;
	}
	public Profesor getTutor() {
		return Tutor;
	}
	public void setTutor(Profesor tutor) {
		Tutor = tutor;
	}
	public String toString() {
		return "Tutorias [Nombre=" + Nombre + ", Matricula=" + Matricula + ", Carrera=" + Carrera + ", Semestre="
				+ Semestre + ", Tutor=" + Tutor + "]";
	}

	
	
	
	}

	
	

 


