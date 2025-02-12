package U4Ejemplos;

public class Ejemplo4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado[]  empleado = new Empleado [3];
		
		Empleado e = new Empleado("12","Empelado1",1999,5000);
		Jefatura j = new Jefatura("13","Jefa1",1998,1000,5000);
		Administrativo a = new Administrativo ("14","Adm1",1992,400,20);
		
		System.out.println("Empleado : "+e);
		System.out.println("Jefatura : "+j);
		System.out.println("Aministrativo : "+a);
		
		empleado[0]= new Empleado("12","Empelado1",1999,5000);
		empleado[1]= new Jefatura("13","Jefa1",1998,1000,5000);
		empleado[2]= new Administrativo ("14","Adm1",1992,400,20);
		
		for(int i=0;i<empleado.length;i++)
			System.out.println(empleado[i]);
	
	}

}

