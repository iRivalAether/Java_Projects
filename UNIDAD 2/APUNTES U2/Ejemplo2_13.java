package U2Ejemplos;

import java.io.IOException;

public class Ejemplo2_13 {

	public static void main(String[] args) throws IOException {
	Cliente cliente1 = new Cliente("1","Juan Perez");
	Vehiculo vehiculo1= new Vehiculo("1234","KIA","2023","Blanco",1200,true);
	Renta renta1=new Renta (cliente1,vehiculo1,26,02,2024,3);
	
	System.out.println(cliente1.toString());
	System.out.println(vehiculo1.toString());
	
	System.out.println(renta1.getCliente().toString());
	System.out.println(renta1.getVehiculo().toString());
	
	System.out.println(renta1.Pago());

 }
}