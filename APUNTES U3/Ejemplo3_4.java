package U3Ejemplos;

public class Ejemplo3_4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		double nt=0;
		//concentrar los datos de tres empleados 
		//calcular el pago de cada uno
		//mostrar la informacion,asi como
		//el calculo total de la nomina
		
		
		
		
		
		Datos d= new Datos();
		Datos d1= new Datos();
		Datos d2 = new Datos();
		d.setDias(5);
		d.setHoras(20);
		d.setPago(150);
		d1.setDias(7);
		d1.setHoras(14);
		d1.setPago(200);
		d2.setDias(4);
		d2.setHoras(24);
		d2.setPago(400);
		
		
		Pagos p = new Pagos();
		Pagos p1 = new Pagos();
		Pagos p2 = new Pagos();
		p.calculo(d);
		p1.calculo(d1);
		p2.calculo(d2);
		System.out.println("El iva calculado es:"+d.getIva());
		System.out.println("Salario calculado es:"+d.getSalario());
		nt = nt+d.getSalario();
		
		d.finalize();
		p.finalize();
		
		
		System.out.println("El iva calculado es:"+d1.getIva());
		System.out.println("Salario calculado es:"+d1.getSalario());
		nt = nt+d1.getSalario();
		
		d1.finalize();
		p1.finalize();
		
		System.out.println("El iva calculado es:"+d2.getIva());
		System.out.println("Salario calculado es:"+d2.getSalario());
		nt = nt+d2.getSalario();
		
		d2.finalize();
		p2.finalize();
		
		System.out.println("La nomina total es:"+nt);
		
		
		

	}

}
