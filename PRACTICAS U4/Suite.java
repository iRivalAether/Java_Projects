package Practicasu4;

public class Suite extends General {
private double extra;

public Suite(int num, double preciohab, double extra) {
    super(num, preciohab);
    this.extra = extra;
}

    public double Pago(double preciohab){
        return this.extra+preciohab;
    }

    public void Mostrar(){

    }
}
