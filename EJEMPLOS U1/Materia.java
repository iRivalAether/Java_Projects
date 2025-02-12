package U1Ejemplos;

public class Materia {

	private char grupo;
	private int nestudiantes;
	private String nombre;
	private String periodo;
	
	
	public char getGrupo() {
		return grupo;
	}
	
	public void setGrupo(char grupo) {
		this.grupo = grupo;
		
	}
	//toString
	//nombre de la materia
	//carrera
	//numero de grupo
	//periodo pero numerico
	
	public int ngrupos() {
		int grupos;
		grupos=this.nestudiantes/15;
		return grupos;
	}
	
	public String getCarrera() {
		String carrera=" ";
		
		if(getGrupo()=='a'||getGrupo()=='A')
			carrera="Ingenieria en sistemas computacionales";
			else
				if(this.grupo=='c'||this.grupo=='C')
					carrera="Ingenieria civil";
				else
					if(this.grupo=='w'||this.grupo=='W')
				carrera="Ingenieria geomatica";
		else
			if(this.grupo=='d'||this.grupo=='D')
				carrera="Ingeniera industrial";
			else
				if(this.grupo=='k'||this.grupo=='K')
					carrera="Ingenieria en negocios";
			else
				carrera="No hay carrera asignada";
	
				
		
		return carrera;
		
	}
	
	public int getNestudiantes() {
		return nestudiantes;
	}
	
	public void setNestudiantes(int nestudiantes) {
		this.nestudiantes = nestudiantes;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(String periodo) {
		if(periodo.equalsIgnoreCase("primavera"))
		this.periodo = "2024-1";
		else
		  if(periodo.equalsIgnoreCase("verano"))
			  this.periodo= "2024-2";
		  else 
			  if(periodo.equalsIgnoreCase("otoño"))
				  this.periodo= "2024-3";
			  else
				  this.periodo= "Periodo incorrecto";
	}
	
	@Override
	public String toString() {
		return "Materia [grupo=" + grupo + ", nestudiantes=" + nestudiantes + ", nombre=" + nombre + ", periodo="
				+ periodo + "]";
	}
	

	
	
 
	
	
	
}
