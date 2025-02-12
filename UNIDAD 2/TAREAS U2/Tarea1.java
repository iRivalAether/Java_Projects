package U2Tareas;
import java.io.*;
public class Tarea1 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader cap = new BufferedReader(new InputStreamReader(System.in));
        int t=0;
		Electrodomesticos[]elec = new Electrodomesticos [3];
		
		elec[0]= new Electrodomesticos(2500,50,"Licuadoras");
		elec[1]= new Electrodomesticos(7000,30,"Pantallas");
		elec[2]= new Electrodomesticos(5000,70,"Estufas");

		for(int x=1; x<=10; x++) {
			elec[0].mostrar();
			elec[1].mostrar();
			elec[2].mostrar();
		System.out.println("Cuantas unidades va a comprar de licuadoras?");
		int lleva= Integer.parseInt(cap.readLine());
		System.out.println("Cuantas unidades va a comprar de pantallas?");
		int lleva1= Integer.parseInt(cap.readLine());
		System.out.println("Cuantas unid3ades va a comprar de Estufas?");
		int lleva2= Integer.parseInt(cap.readLine());
		
		
		//elec[0].setStock(elec[0].getStock()-lleva);
		
		int l=elec[0].getStock()-lleva;
	    int l1=elec[1].getStock()-lleva1;
		int l2=elec[2].getStock()-lleva2;
		int p =lleva*elec[0].getPrecio();
		int p1=lleva1*elec[1].getPrecio();
		int p2=lleva2*elec[2].getPrecio();
		t= p+p1+p2;		
		
		System.out.println("Sobran estas unidades de licuadoras:");
	    System.out.println(lleva);
	    System.out.println("Sobran estas unidades de pantallas:");
	    System.out.println(lleva1);
	    System.out.println("Sobran estas unidades de Estufas:");
	    System.out.println(lleva2);
	    System.out.println("Su total de gastos es:");
	    System.out.println(t);
	   
		}
	}


}
