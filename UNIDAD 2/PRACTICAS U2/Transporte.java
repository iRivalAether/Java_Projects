package U2Practicas;
import java.util.Date;
import java.util.Scanner;
public class Transporte {
	Scanner cap = new Scanner(System.in);
    private String Nombre;
    private int Ruta;
    private int No_de_asiento;
    private double BG;
    private String h;
    private int edad;
    private int Maestro;
    private int limi;
    
    public String getNombre(String string) {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getRuta(int i) {
		
		return Ruta;
	}
	public void setRuta(int ruta) {
		Ruta = ruta;
	}
    
    public int getMaestro(int i) {
		return Maestro;
	}
	public void setMaestro(int maestro) {
		Maestro = maestro;
	}
	public int getEdad(int i) {
	
		return edad;	}
	public void setEdad(int edad) {
		if(Ruta==1) {
			h="CDMX";
			BG=1800;
			limi=45;
			
		}
		else if(Ruta==2) {
			h="Guadalajara";
			BG=2000;
			limi=50;
		}
		
		else if(Ruta==3) {
			h="Monterrey";
			BG=1500;
			limi=40;
		}
		if(Maestro==1) 
    		BG= BG -(BG*0.15);
 
		if(edad>17&&edad<65&&Maestro==0) 
			BG= BG-(BG*0.10);
		
		if(edad>64&&Maestro==0) {
			BG= BG -(BG*0.50);
		 
		}
		    
		this.edad = edad;
	}

	
	public int getNo_de_asiento() {
        if(No_de_asiento>limi) {
        	System.out.println("VALOR INCORRECTO");
        	System.out.println("Porfavor ponga un valor admitido");
        }
		return No_de_asiento;
	}
	public void setNo_de_asiento(int no_de_asiento) {
		No_de_asiento = no_de_asiento;
	}
	public double getBG() {
		return BG;
	}
	public void setBG(Double bG) {
		BG = bG;
	}
	@Override
	public String toString() {
		return "Transporte [Nombre=" + Nombre + ", Destino a:" + h + ", No_de_asiento=" + No_de_asiento + ", BG=" + BG
				+ ", edad=" + edad + ", Maestro=" + Maestro +  "]";
	}
	public static void destinos() {
		System.out.println("Destinos disponibles:");
		System.out.println("1. CDMX");
		System.out.println("2. Guadalajara");
		System.out.println("3. Monterrey");
		
	}
	public static void nye() {
		System.out.println("Nombre completo de la persona que abordara el vuelo:");
	    System.out.println("Edad de la persona que abordara el vuelo");
	    System.out.println("Es usted Maestro?    1.Si 0.NO");
	    
		
		
	}
	
    public static void Precios1() {
    	System.out.println("Precio del viaje");
    	System.out.println("1800 $");
 
    }
    public static void Precios2() {
    	System.out.println("Precio del viaje");
    	System.out.println("2000 $");

    }
    
    public static void Precios3() {
    	System.out.println("Precio del viaje");
    	System.out.println("1500 $");
 
    }
    public static void descuentos() {
        System.out.println("Descuentos Disponibles");
        System.out.println("1. Estudiante");
        System.out.println("Condicion: Ser mayor de 18 años");
        System.out.println("2. Maestro");
        System.out.println("Condicion: Ser maestro de algun institucion educativa");
        System.out.println("3. Descuento de viejitos");
        System.out.println("Condicion: Ser mayor de 65 años");
        System.out.println("NOTA: NO PUEDES TENER MAS DE UN DESCUENTO");
    	
    }
    public static void na1() {
    	System.out.println("El numero de asientos disponibles para este vuelo son:");
    	System.out.println("45 ASIENTOS DISPONIBLE");
    	System.out.println("Escoga su asiento dentro del limite permitido: 1-45");
 
    }
    public static void na2() {
    	System.out.println("El numero de asientos disponibles para este vuelo son:");
    	System.out.println("50 ASIENTOS DISPONIBLE");
    	System.out.println("Escoga su asiento dentro del limite permitido: 1-50");
    }
    public static void na3() {
    	System.out.println("El numero de asientos disponibles para este vuelo son:");
    	System.out.println("40 ASIENTOS DISPONIBLE");
    	System.out.println("Escoga su asiento dentro del limite permitido: 1-40");
    }
	}
    

