package U5Ejemplos;

public class Ejemplo5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Alumno a= new Alumno("Pedro","ISC",8);
			System.out.println(a);
		}catch(Negativo e) {
			System.out.println("Error:"+e.getMessage());
			System.out.println("El valor que genero el error es:"+e.getNumero());
		}
	}

}
