package U6Tareas;

public class Libro {

	private String titulo;
	private String editorial;
	private int numpaginas;
	Autor autor;
	
	public Libro(String titulo) {
		
	}

	public Libro(String titulo, String editorial, int numpaginas, Autor autor) {
		super();
		this.titulo = titulo;
		this.editorial = editorial;
		this.numpaginas = numpaginas;
		this.autor = autor;
	}
	
	public void mostrarinformacion() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumpaginas() {
		return numpaginas;
	}

	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
