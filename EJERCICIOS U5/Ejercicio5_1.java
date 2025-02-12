package U5Ejercicios;
import java.util.Scanner;
public class Ejercicio5_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
	     double num;
	     System.out.println("Dame un valor:");
	     num= cap.nextDouble();
	     
	     try{
				comprobar(num);
				System.out.println(num/100);
	     }catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				System.out.println(100/1);
				
			}
	     

	}
	
	public static void comprobar(Double num) throws IllegalArgumentException{
		if(num<1) {
			throw new IllegalArgumentException("El valor no esta permitido");
		}
	}

}
