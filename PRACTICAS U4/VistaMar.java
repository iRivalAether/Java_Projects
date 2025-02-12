 package Practicasu4;

public class VistaMar extends General {

    private double bono;

    public VistaMar(int num, double preciohab, double bono) {
        super(num, preciohab);
        this.bono = bono;
    }

    public double Pago(double preciohab){
    return bono+preciohab;
    }

   public void mostrar(){
    
    
   }

}
