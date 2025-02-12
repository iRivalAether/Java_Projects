package U2Practicas;
import java.util.Scanner;
public class Practica2_1 {

	public static void main(String[] args) {
		Scanner cap = new Scanner(System.in);
		// TODO Auto-generated method stub
       Menpresa[] Micro = new Menpresa[5];
       Pagar Pagar = new Pagar(Micro);
       
       for (int i=0;i<Micro.length;i++) {
    	   System.out.println("Ingresa el nombre del empleado:");
    	   String nom=cap.nextLine();
    	   System.out.println("Ingresa el numero de empleado:");
    	   String n= cap.nextLine();
    	   System.out.println("Ingresa el numero de horas laboradas en la semana 1:");
    	   String h1= cap.nextLine();
    	   System.out.println("Ingresa el numero de horas laboradas en la semana 2:");
    	   String h2= cap.nextLine();
    	   System.out.println("Ingresa el numero de horas laboradas en la semana 3:");
    	   String h3= cap.nextLine();
    	   System.out.println("Ingresa el numero de horas laboradas en la semana 4:");
    	   String h4= cap.nextLine();
    	   Micro [i] = new Menpresa(nom,n,h1,h2,h3,h4);
       }
        for (int x=0; x<Micro.length;x++) {
        	System.out.println(Micro[x].toString());
        }
       System.out.println("Total general a pagar:"+Pagar.getResultado());
	}

}
