package U1Practicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
public class Practica1_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader cap = new BufferedReader(new InputStreamReader(System.in));
		Date fecha = new Date();
		String k,f,g,h;
		
		Transporte p1 = new Transporte();
		
		
				
		System.out.println("Nombre del comprador:");
		p1.setNombre(cap.readLine());
		System.out.println("Seleccione su destino:");
		System.out.println("1.CDMX");
		System.out.println("2.GUADALAJARA");
		System.out.println("3.MONTERREY");
		k=cap.readLine();
		p1.setRuta(Integer.parseInt(k));
		
		System.out.println("Eres Maestro? (1. Si soy , 0. No soy)");
		f=cap.readLine();
		p1.setMaestro(Integer.parseInt(f));
		
		System.out.println("Edad del comprador:");
		g=cap.readLine();
		p1.setEdad(Integer.parseInt(g));
	
		
		System.out.println("Ingresa tu asiento(Maximo 40):");
	    h=cap.readLine();
		p1.setNo_de_asiento(Integer.parseInt(h));
		
	    System.out.println(p1.toString());
		System.out.println(fecha);
		

	}

}
