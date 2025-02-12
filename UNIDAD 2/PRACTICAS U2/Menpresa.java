package U2Practicas;

public class Menpresa {
      private String nombre;
      private String ntrabajador;
      private String hlaboradas1;
      private String hlaboradas2;
      private String hlaboradas3;
      private String hlaboradas4;
      
      public Menpresa(String nombre, String ntrabajador, String hlaboradas1,String hlaboradas2,String hlaboradas3,String hlaboradas4 ) {
    	  this.nombre=nombre;
    	  this.ntrabajador=ntrabajador;
    	  this.hlaboradas1=hlaboradas1;
    	  this.hlaboradas2=hlaboradas2;
    	  this.hlaboradas3=hlaboradas3;
    	  this.hlaboradas4=hlaboradas4;
      }
      public Menpresa() {
    	  this.nombre="";
    	  this.ntrabajador="";
    	  this.hlaboradas1="";
    	  this.hlaboradas2="";
    	  this.hlaboradas3="";
    	  this.hlaboradas4="";
      }
      
      
      public String getTotal1() {
    	  double pago= Double.parseDouble(hlaboradas1);
    	  double pago1= Double.parseDouble(hlaboradas2);
    	  double pago2= Double.parseDouble(hlaboradas3);
    	  double pago3= Double.parseDouble(hlaboradas4);
    	  pago= pago+pago1+pago2+pago3;
    	  
    	  String Total1 = String.valueOf(pago);
    	  return Total1;
    	  
      }
	@Override
	public String toString() {
		return "Menpresa [nombre=" + nombre + ", ntrabajador=" + ntrabajador + ", hlaboradas1=" + hlaboradas1
				+ ", hlaboradas2=" + hlaboradas2 + ", hlaboradas3=" + hlaboradas3 + ", hlaboradas4=" + hlaboradas4
				+", total de horas=" + getTotal1()+"]";
	}
      
      
      
}
