package U1Practicas;
import java.util.Date;
public class Transporte {
    private String Nombre;
    private int Ruta;
    private int No_de_asiento;
    private double BG;
    private String h;
    private int edad;
    private int Maestro;
    
    public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getRuta() {
		
		return Ruta;
	}
	public void setRuta(int ruta) {
		Ruta = ruta;
	}
    
    public int getMaestro() {
		return Maestro;
	}
	public void setMaestro(int maestro) {
		Maestro = maestro;
	}
	public int getEdad() {
	
		return edad;	}
	public void setEdad(int edad) {
		if(Ruta==1) {
			h="CDMX";
			BG=1800;
			
		}
		else if(Ruta==2) {
			h="Guadalajara";
			BG=2000;
		}
		
		else if(Ruta==3) {
			h="Monterrey";
			BG=1500;
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
    
    
	
	}
    

