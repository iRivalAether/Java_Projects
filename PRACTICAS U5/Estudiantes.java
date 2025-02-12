package U5Practica;

public class Estudiantes {
	    private String nombre;
	    private Materia materia;

	    public Estudiantes(String nombre, Materia materia) {
	        this.nombre = nombre;
	        this.materia = materia;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public Materia getMateria() {
	        return materia;
	    }

	    @Override
	    public String toString() {
	        return "Estudiante{" +
	                "nombre='" + nombre + '\'' +
	                ", materia=" + materia.getNombre() +
	                '}';
	    }
	    public class EstudianteNoPerteneceException extends RuntimeException {
	        public EstudianteNoPerteneceException(String message) {
	            super(message);
	        }
	    }

	    public class EstudianteYaRegistradoException extends RuntimeException {
	        public EstudianteYaRegistradoException(String message) {
	            super(message);
	        }
	    }
}
