package U3Ejemplos;
import java.util.Scanner;
public class Ejemplo3_3 {
	public static double r ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
        double base, altura,t,re,,c;
		
		System.out.println("Figuras");
		System.out.println("Dame la base:");
	    base = cap.nextDouble();
	    System.out.println("Dame la altura:");
		altura = cap.nextDouble();
		System.out.println("Dame el radio:");
		Metodos2 obj = new Metodos2(cap.nextDouble());
		
		t=obj.triangulo(base, altura);
		re=obj.rectangulo(base, altura);
		c=obj.circulo();
		
		System.out.println("Area del triangulo:"+t);
		System.out.println("Area del rectangulo:"+r);
		System.out.println("Area del circulo:"+c);
	   
		
		
		//capturan e imprimen
		//area del circulo
		//area del triangulo
		//area del rectangulo
		//area del cilindro
		
		

	}
	
	//crear el metodo de clase para calcular
	public double cilindro() {
		return area;
	}
			//area del cilindro
}
