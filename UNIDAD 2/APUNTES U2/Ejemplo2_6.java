package U2Ejemplos;
import java.util.ArrayList;
public class Ejemplo2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList elementos= new ArrayList();
		String cadena="POO";
		int edad=30;
		long matricula=123456;
		double promedio = 7.8;
		
		elementos.add(cadena);
		elementos.add(edad);
		elementos.add(promedio);
		elementos.add(matricula);
		
		for(Object o:elementos) {
			System.out.println(o);
		}
		
		
		

	}

}
