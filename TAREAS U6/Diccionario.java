package U6Tareas;

public class Diccionario extends Libro {
	
	private String idioma;

	public Diccionario(String titulo, String editorial, int numpaginas,Autor autor, String idioma) {
		super(titulo);
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String buscarDefinicio(String palabra) {
		return palabra;
	}
	
	public void mostrarInformacion() {
		
	}
	

}
