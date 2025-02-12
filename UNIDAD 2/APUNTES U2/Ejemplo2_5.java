package U2Ejemplos;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejemplo2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
		ArrayList<Double> dias = new ArrayList<>();
        double dia,suma=0,prom=0;
        
		for(int i=1;i<=7;i++) {
			System.out.println("Ingresa el consumo del dia #"+i);
			dia= cap.nextDouble();
			dias.add(dia);
		
			
		}
		System.out.println(dias);
		
		for(Double x:dias) 
			suma+=x;
			
		prom=suma/7;
		
		for(int i=0;i<dias.size();i++)
			if(dias.get(i)>prom)
				System.out.println("Su consumo kwh por arriba del promedio="+dias.get(i));

	}

}
