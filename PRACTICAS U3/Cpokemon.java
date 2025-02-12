package U3Practicas;
import java.util.Random;
public class Cpokemon {
	
     private int ID;
     private String Nombre;
     private int Estado_de_salud;
     private String Color;
     private int turno;
     Random aleatorio = new Random();
     public static int placaje= 250;
     

	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getEstado_de_salud() {
		return Estado_de_salud;
	}

	public void setEstado_de_salud(int estado_de_salud) {
		Estado_de_salud = estado_de_salud;
	}
	
	public void turnos(){
		int turnos= aleatorio.nextInt(10);
		
		if(turnos<4) {
			System.out.println("Fallo el ataque");
		}
		else if(turnos>4) {

			 if(ID==1) {
				    placaje = placaje;
		    		int ascuas  = 750;
		    		int llamarada = 1300;
		    	 }
		    	 else if(ID==2) {
		    		 placaje = placaje;
		    		 int chorro_de_agua = 400;
		    		 int Tormenta = 900;
		    	 }
		    	 else if (ID==3) {
		    		 placaje = placaje;
		    		 int latigo_sepa= 350;
		    		 int Brotes = 600;
		    	 }
		    	 else if(ID==4) {
		    		 placaje = placaje;
		    		 int psicoataque= 800;
		    		 int estremecer = 1500;
		    	 }
		    	 else if (ID==5) {
		    		 placaje = placaje;
		    		 int latigo_sepa = 400;
		    	 }
		    	 else if (ID==6) {
		    		  placaje = placaje;
		    		 int electrocutar= 659;
		    		 int relampago= 2000;
		    	 }
		}
		else if(turnos>=10)
		{
			 if(ID==1) {
		    		placaje = placaje*2;
		    		int ascuas  = 750*2;
		    		int llamarada = 1300*2;
		    	 }
		    	 else if(ID==2) {
		    		 placaje = placaje*2;
		    		 int chorro_de_agua = 400*2;
		    		 int Tormenta = 900*2;
		    	 }
		    	 else if (ID==3) {
		    		 placaje = placaje*2;
		    		 int latigo_sepa= 350*2;
		    		 int Brotes = 600*2;
		    	 }
		    	 else if(ID==4) {
		    		 placaje = placaje*2;
		    		 int psicoataque= 800*2;
		    		 int estremecer = 1500*2;
		    	 }
		    	 else if (ID==5) {
		    		 placaje = placaje*2;
		    		 int latigo_sepa = 400*2;
		    	 }
		    	 else if (ID==6) {
		    		 placaje = placaje*2;
		    		 int electrocutar= 659*2;
		    		 int relampago= 2000*2;
		    	 }
		     }
			 
		}
   
		public void mostrar() {
			System.out.println("Escoge los pokemones que quieres que se peleen:");
			System.out.println("1. Charmander");
			System.out.println("2. Squirtle");
			System.out.println("3. Bulbasaur");
			System.out.println("4. Newtwo");
			System.out.println("5. Metapod");
			System.out.println("6. Pikachu");
		}
     
     
}
