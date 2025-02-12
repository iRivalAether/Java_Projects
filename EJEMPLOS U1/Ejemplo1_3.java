package U1Ejemplos;

public class Ejemplo1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleo empleado1,empleado2;
		empleado1=new Empleo();
		empleado2=new Empleo();
		
		
		empleado1.setNombre("Juan");
		empleado1.setActividad("Ingeniero");
		empleado1.setEdad(0);
		
		empleado2.setNombre("Maria");
		empleado2.setActividad("Cajera");
		empleado2.setEdad(20);
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println();
		
		
	}

}
