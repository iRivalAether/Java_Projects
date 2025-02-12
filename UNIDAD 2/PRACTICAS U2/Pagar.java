package U2Practicas;

public class Pagar {
 
	  private Menpresa[] menpresa;
		  
	  public Pagar (Menpresa[] menpresa) {
		  this.menpresa=menpresa;
		  
	  }
	  
	  public String getResultado() {
		  double prom=0;
		  for(int i=0; i<menpresa.length;i++) 
		  prom = prom + Double.parseDouble(menpresa[i].getTotal1());
		  String resultado;
		  String mjr;
		  resultado = String.valueOf(prom*80);
		  return resultado;
			  
		  
	  }
	  
}
