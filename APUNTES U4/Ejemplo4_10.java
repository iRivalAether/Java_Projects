package U4Ejemplos;

public class Ejemplo4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura f= new Factura();
		Cliente c = new Cliente();
		imprime(f);

	}
	
	public static void imprime(Imprimir obj){
		obj.imprimir();
	}

}
