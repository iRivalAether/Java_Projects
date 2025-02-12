package U4Ejemplos;
import java.util.ArrayList;
public class Ejemplo4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<Profesor>profesores=new ArrayList<Profesor>();
			
			PHL prof1=new PHL("5678", "Dan pelon", "5", "400");
			PHL prof2=new PHL("9101", "Napoleon", "8", "600");
			PTC prof3=new PTC("9101", "Isidro Tobon", "10000");
			PTC prof4=new PTC("1514", "Victor", "10000");
			
			profesores.add(prof1);
			profesores.add(prof2);
			profesores.add(prof3);
			profesores.add(prof4);
			
			for(Profesor obj:profesores)
				if(obj instanceof PTC)
					System.out.println("Datos del profesorde tiempo completo: "+obj.toString()+" Salario: "+((PTC)obj).getSalario());
				else
					if(obj instanceof PHL)
						System.out.println("Datos del profesorde tiempo de horario libre: "+obj.toString()+" Salario: "+((PHL)obj).getPagoh());
	}

}
