package U5Tareas;

public class Comprobar extends Exception{
	
	private int numero;

	public Comprobar(String mensaje,int numero) {
		super(mensaje);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
}
