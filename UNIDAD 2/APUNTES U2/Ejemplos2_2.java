package U2Ejemplos;
import java.io.*;
public class Ejemplos2_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader cap = new BufferedReader(new InputStreamReader(System.in));
		Productos1 []prod= new Productos1 [4];
		
		prod[0]= new Productos1("Cafe del dia");
	
		
		prod[1]= new Productos1();
		
		prod[2]= new Productos1(104,"Cafe americano",50);
		
		System.out.println("Ingresa el codigo del productos:");
		int id= Integer.parseInt(cap.readLine());
		System.out.println("Ingresa el cafe que prefieres:");
		String cadena=cap.readLine();
		System.out.println("Ingresa el valor:");
		int costo= Integer.parseInt(cap.readLine());
		prod[3]= new Productos1(id,cadena,costo);
		
		  for(int x=0;x<prod.length;x++) 
		       prod[x].mostrar();
	       
		  
		
		
		
	}

}
