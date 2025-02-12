package U5Ejemplos;

public class Ejemplo5_11 {
	
	public static void validar(String cadena)throws IllegalArgumentException {
		if(cadena.length()<10)
			throw new IllegalArgumentException("La cadena contiene menos de 10 caracteres");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			validar("Hola");
		}catch(IllegalArgumentException e) {
		    System.out.println(e.getMessage());
		    

		}

	}

}
