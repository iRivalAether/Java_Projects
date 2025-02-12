package U1Ejercicios;
import java.util.Scanner;
public class Ejercicio1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
         Cuadrilatero Triangulo = new Cuadrilatero();
         Cuadrilatero Rectangulo = new Cuadrilatero();
         Cuadrilatero Cuadrado = new Cuadrilatero();
		
		System.out.println("Dame el altura");
		Triangulo.altura= cap.nextInt();
		
	    System.out.println("Dame la base");
	    Triangulo.base= cap.nextInt();
	    
	    Triangulo.formula3();
	    
	    System.out.println("Dame el lado");
		Cuadrado.lado= cap.nextInt();
	
		Cuadrado.formula1();
		
	    System.out.println("Dame la base");
	    Rectangulo.base= cap.nextInt();
	    
	    System.out.println("Dame la altura");
	    Rectangulo.altura= cap.nextInt();
	    
	    Rectangulo.formula2();
		
		
		
         
	}

}
