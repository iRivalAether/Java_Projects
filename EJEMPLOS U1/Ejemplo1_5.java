package U1Ejemplos;
import java.util.Scanner;
public class Ejemplo1_5 {

    public static void main(String args[]){
    	
    	//Modificar los metodos set and getters y poner tostring
    	//crear un objeto de tipo tutorias
    	//crear un objeto de tipo profesor 
    	
    	//mediante l asignacion le voy a dar valor al objeto de tipo de tutorias
    	//solo en los metodos nombre, matricula, carrera, semestre
    	//mediante la asignacion le voy a dar valor
    	//al objeto de tipo profesor
    	//le asigno valor al objeto de tipo tutorias 
    	//mediante su metodo tutor
    	//mando imprimir los valores necesarios de la clase
    	//del objeto tipo tutorias
    	
    	Scanner cap = new Scanner(System.in);
    	Tutorias t1 = new Tutorias();
    	Profesor p1 = new Profesor();
    	
    	System.out.println("Dame el nombre:");
    	t1.setNombre(cap.nextLine().trim());
    	System.out.println("Dame la matricula:");
    	t1.setMatricula(cap.nextLine().trim());
    	System.out.println("Dame la carrera:");
    	t1.setCarrera(cap.nextLine().trim());
    	System.out.println("Dame el semestre");
    	t1.setSemestre(cap.nextInt());
    	cap.nextLine();
    	
    	System.out.println("Nombre del profesor");
    	p1.setNombre(cap.nextLine().trim());
    	
    	System.out.println(t1.toString());
    }

}
