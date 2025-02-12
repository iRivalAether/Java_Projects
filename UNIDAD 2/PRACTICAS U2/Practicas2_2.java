package U2Practicas;
import java.util.ArrayList;
import java.util.Scanner;
public class Practicas2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
		 ArrayList<Transporte>trans= new ArrayList<Transporte>();
		 Transporte t = new Transporte();
		 //nombre,edad,destino,descuentos
		 
		 Transporte.nye();
		 t.getNombre(cap.nextLine().trim());
		 t.getEdad(cap.nextInt());
		 t.getMaestro(cap.nextInt());
		 
		 System.out.println("Seleccione su menu:");
		 System.out.println("0. Destinos");
         System.out.println("1. Descuentos Disponibles");
		 int m1 = cap.nextInt();
		 
		 if(m1==0) {
			 Transporte.destinos();
			 int d= cap.nextInt();
			 t.getRuta(d);
			 if(d==1) {
		     Transporte.Precios1();
			 Transporte.na1();
			 t.toString();
			 
			 }
			 if(d==2) {
			 Transporte.Precios2();
			 Transporte.na2();
			 t.toString();
	
			 }
			 if(d==3) {
		     Transporte.Precios3();
			 Transporte.na3();
			 t.toString();
			 }
		 }
		 else 
			 Transporte.descuentos();
	     
		 
		 
		
		
		 
		 

	}

}
