package U5Ejemplos;

public class Negativo extends Exception {
	
	private int numero;

	public Negativo(String mensaje,int numero) {
		super(mensaje);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	
	

}
