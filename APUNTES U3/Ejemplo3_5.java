package U3Ejemplos;
import java.util.ArrayList;
import java.util.Collections;
public class Ejemplo3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer>numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(0,2);
		numeros.add(5);
		numeros.add(0,3);
		numeros.add(4);
		numeros.add(0,6);
		
		System.out.println(numeros);
		System.out.println("Ordenado de manera ascendente.....");
		ordenar(numeros);

	}
	
	public static void ordenar(ArrayList<Integer> valores) {
		
		for(int i=0;i<valores.size();i++) {
			Collections.sort(valores);
			System.out.println(valores.get(i).getClass()+""+valores.get(i).toString());
		}
		
	}

}
