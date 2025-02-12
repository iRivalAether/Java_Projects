package U4Ejemplos;

public class Cantante extends Artista{
	
	private String cancion;

	public Cantante(String nombre, String cancion) {
		super.setNombre(nombre);
		this.cancion = cancion;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	
	public String mostrar() {
		return "El cantante: "+super.getNombre()+" tiene la cancion: "+this.getCancion();
	}
	
	public void mensaje() {
		super.mensaje();
		System.out.println("Y es un cantante famoso");
	}
}
