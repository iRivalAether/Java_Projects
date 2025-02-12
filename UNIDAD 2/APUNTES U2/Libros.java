package U2Ejemplos;

public class Libros {
	
	private String nombre;
	private int ntitulos;
	
	public Libros(String nombre, int ntitulos) {
		
		this.nombre=nombre;
		this.ntitulos=ntitulos;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNtitulos() {
		return ntitulos;
	}
	
	public void mostrar(){
		System.out.println("Nombre del libro="+this.getNombre()+"Numero del titulo="+this.getNtitulos());
	}

}
