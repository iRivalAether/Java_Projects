package Practicasu4;

public class Practica4_2 {
    public static void main(String[] args) {
        
    General habitacion1=new General(1, 1500);
   VistaMar habitacion2=new VistaMar(2, 1500, 500);
    Suite habitacion3=new Suite(3, 2000, 1000);

    System.out.println("Reserva de habitaciones");

    habitacion1.Mostrar();
    habitacion2.Mostrar();
    habitacion3.Mostrar();
    }
}
