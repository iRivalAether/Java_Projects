package U4Ejemplos;

public class Actor extends Artista{
	
	private String pelicula;

	public Actor(String nombre, String pelicula) {
		super.setNombre(nombre);
		this.pelicula=pelicula;	
		
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	public String mostrar() {
		return "El actor: "+super.getNombre()+" actua en la pelicula: "+this.getPelicula();
	}
	
	public void mensaje() {
		System.out.println("Y es un actor famoso");
	}
}
