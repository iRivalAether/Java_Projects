package U2Ejemplos;

public class Alumnos {
private String nombre;
private String matricula;
private String calif1,calif2,calif3;

public Alumnos(String nombre, String matricula, String calif1, String calif2, String calif3 ) {
	this.nombre=nombre;
	this.matricula=matricula;
	this.calif1=calif1;
	this.calif2=calif2;
	this.calif3=calif3;
	
}

public Alumnos() {
	this.nombre="";
	this.matricula="";
	this.calif1="-1";
	this.calif2="-1";
	this.calif3="-1";
}

public String getPromedio() {
	//calcular en tipo double el promedio
	//devuelve en cadena
	double cali1 = Double.parseDouble(calif1);
	double cali2 = Double.parseDouble(calif2);
	double cali3 = Double.parseDouble(calif3);
	cali1= (cali1+cali2+cali3)/3;
	
	String p=String.valueOf(cali1);
	return null;
}


public String toString() {
	return "Alumnos [nombre=" + nombre + ", matricula=" + matricula + ", calif1=" + calif1 + ", calif2=" + calif2
			+ ", calif3=" + calif3 + "]";
}


}
