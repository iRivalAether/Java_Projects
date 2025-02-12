package U4Ejemplos;
import java.util.ArrayList;
public class Ejemplo4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Mascota> pet = new ArrayList<Mascota>();
	
		Perros perro1 = new Perros("Firulais","Labrador","Beige");
		Perros perro2 = new Perros("Solovino","Husky","Tricolor");
		Gatos gato1 = new Gatos("Micho","Persa","Amarillo");
		Gatos gato2 = new Gatos("Minino","Siames","Blanco");
		
		pet.add(perro1);
		pet.add(perro2);
		pet.add(gato1);
		pet.add(gato2);
		
		for(Mascota m:pet)
			if(m instanceof Perros)
				System.out.println("Perros......"+m.info());
			else 
				if(m instanceof Gatos)
					System.out.println("Gatos......."+m.info());

		
		

	}

}
