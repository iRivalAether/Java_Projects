package U2Ejemplos;
import java.util.ArrayList;
public class Ejemplo2_4 {

	public static void main(String[] args) {
		// TODO Auto-gene rated method stub
		ArrayList<Productos1>productos= new ArrayList<Productos1>();
        int pos;
		
		Productos1 prod1 = new Productos1(1,"Cafe 1",50);
		Productos1 prod2 = new Productos1(2,"Cafe 2",40);
		Productos1 prod4 = new Productos1(4,"Cafe 4",70); 
		
		productos.add(prod1);
		productos.add(prod2);
		productos.add(new Productos1(3,"cafe 3",60));
		
		productos.set(1, prod4);
		productos.remove(0);
		
		for(int i=0;i<productos.size();i++) {
			productos.get(i).mostrar();
			pos=productos.indexOf(prod4);
			
			if(productos.contains(prod4)) {
				System.out.println("si contiene el valor");
				productos.get(pos).mostrar();
			}
				
			
			productos.clear();
			if(productos.isEmpty())
				System.out.println("El array contiene informacion");
			else 
				System.out.println("El array no contiene informacion");
		}
		
	}

}
