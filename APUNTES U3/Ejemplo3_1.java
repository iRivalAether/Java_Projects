package U3Ejemplos;
import java.util.Scanner;
public class Ejemplo3_1 {
public static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// con esto puedo llamarlo la clase de abajo
		Scanner cap = new Scanner(System.in);
		String cadena="";
		Suma obj=new Suma();
		int resultado=menu();
		
		if(resultado==1) {
			
			System.out.println("Ingresa el dividendo:");
			int num1=cap.nextInt();
			System.out.println("Ingresa el divisor:");
			int num2=cap.nextInt();
			
			
		}
		else if(resultado==2) {
			System.out.println("Dame el numero de la tabla=");
			int valor= cap.nextInt();
			cadena=tabla(valor);
			System.out.println(cadena);
			
		}
		else if(resultado==3) {
			System.out.println("Ingrese el numero:");
			num=cap.nextInt();
			System.out.println("Potencia="+potencia());
			
		}
		else if(resultado==4) {
			obj.setN1(4);
			obj.setN2(10);
			obj.mostrar();
			Suma.v1=20;
			Suma.v2=10;
			System.out.println("suma metodo de clase="+Suma.suma());
		}
		
	}
	public static int potencia(){
		return(int) Math.pow(num,2);
	}
	
	
	public static String tabla(int valor) {
		String cadena="";
		int num;
		for(int i=1;i<=10;i++) {
			num=i*valor;
			cadena=cadena+num+"\n";
		}
		return cadena;
	}
	
	public static void division(int d1, int d2) {
		
		int i=1,resto=0,j=1;
		
		while(i!=0) {
			resto=d1-d2;
			if(resto>=d2) {
				d1=resto;
				j++;
				}
			else
				i=0;
		}
		System.out.println("El cociente es="+j);
	
	}
	public static int menu() {
		Scanner cap = new Scanner(System.in);
		System.out.println("1-division");
		System.out.println("2-Tabla");
		System.out.println("3-Potencias");
		System.out.println("4-datos tipo objeto");
		System.out.println("Selecciona la opcion:");
		int opcion = cap.nextInt();
		return opcion;
	}

}
