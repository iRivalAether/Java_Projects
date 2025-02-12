package Practicasu4;

public class General implements Reservation {

    private int num;
    private double preciohab;

    

    public General(int num, double preciohab) {
        this.num = num;
        this.preciohab = preciohab;
    }

    @Override
    public void Mostrar() {
        System.out.println("Habitacion"+this.num+" precio:"+this.preciohab);
        
    }


    @Override
    public double Pago() {
        return preciohab;
    }


    
}
