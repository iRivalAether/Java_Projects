package U3Ejemplos;

public class Pagos {
	
	public void calculo(Datos d) {
		double ingreso,iva,neto;
		ingreso = d.getHoras()*d.getDias()*d.getPago();
		
		if(ingreso>3000) 
			iva=ingreso*0.08;
		else
				iva=0;
		
		neto=ingreso-iva;
		
		d.setIva(iva);
		d.setSalario(neto);
		
	
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.err.println("Liberando memoria objeto Pagos");
		
	}
	
}
