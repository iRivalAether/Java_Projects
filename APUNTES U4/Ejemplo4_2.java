package U4Ejemplos;

public class Ejemplo4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Profesor prof=new Profesor("1234", "Jose Javier");
		PHL prof2=new PHL("5678", "Dan pelon", "5", "400");
		PTC prof3=new PTC("9101", "Isidro Tobon", "10000");
		
		Pcontrato prof4=new Pcontrato("1112", "Dante","20","250", false);
		
		System.out.println("Datos del profesor: "+prof.toString());
		System.out.println("Datos del profesor horario libre: "+prof2.toString()+" Salario");
		System.out.println("Datos del profesor profesor de tiempo completo: "+prof3.toString());
		
		
		/*if(prof2 instanceof PTC)
			System.out.println("Si");
		else
			System.out.println("No");*/
		
	}

}
