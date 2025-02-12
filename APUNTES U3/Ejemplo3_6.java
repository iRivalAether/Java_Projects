package U3Ejemplos;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.Date;
public class Ejemplo3_6 {

	static ArrayList<Productos>p;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader cap = new BufferedReader(new InputStreamReader(System.in));
		
		//ticket de compra
		//la fecha de compra el total de productos
		//el monto total de la compra
		
		
		int r=-1;
		int pr=0;
		String op="-1";
		agregar();
		
		while(op.compareTo("0")!=0) {
		System.out.println(p.toString());
		
		System.out.println("Que producto desea:");
		int codigo = Integer.parseInt(cap.readLine());
		
		//p.size sirve para recorrer la estructura
		for(int i=0;i<p.size();i++) {
			if(codigo==p.get(i).getId()) {
				System.out.println("Esta en el menu:"+p.get(i).toString());
				r=0;
				pr=p.get(i).getPrecio()+pr;
			}
			if(r!=0) 
				System.out.println("No esta en el menu.....");
			 r=-1;
			 }
		System.out.println("Si deseas seguir comprando ingresa un valor diferente de 0");
		op=cap.readLine();
		}
		System.out.println("Precio total del coste:"+pr);
		

	}

	public static ArrayList<Productos> agregar(){
		p= new ArrayList<Productos>();
		p.add(new Productos(1,30,"Refresco"));
		p.add(new Productos(2,40,"Papas"));
		p.add(new Productos(3,80,"Hamburguesas"));
	    return p;
	}
	
		
		
}
