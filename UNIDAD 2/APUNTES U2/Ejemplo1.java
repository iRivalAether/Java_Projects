package U2Ejemplos;
import java.util.Scanner;
public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
         Productos p = new Productos();
         int k = 0;
        
         
        p.menu();
        System.out.println("Selecciona 3 productos del menu:");
        for(int x=1;x<=3;x++) {
        	System.out.println("Selecciona el .producto "+x);
        	p.setCodigo(cap.nextInt());
        	if(p.getCodigo()<101) {
        		System.out.println("Este producto no se encuentra, vuelva a pedirlo");
        		x--;
        	}
        	else if (p.getCodigo()>107) {
        		System.out.println("Este producto no se encuentra, vuelva a pedirlo");
        	    x--;
        	}
        	p.buscar(p.getCodigo()) ; 
      
        	k=k+(p.getPrecio());
        
        	
        }
        	System.out.println("Tu coste total de todos los productos es:"+k);
	}

}
