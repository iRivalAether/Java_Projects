package U3Tareas;
import java.util.Scanner;
public class Serie_fibonacci {
	Scanner cap = new Scanner(System.in);
	 private static int num1=0,num2=1,num3=3;
     private int n,i;
     
     public void preguntar()	{
    	 System.out.println("Serie fibonacci");
    	 System.out.println("Cuantos numeros de la serie quieres?");
    	 System.out.println("limite 20");
    	 this.n= cap.nextInt();
    	 
    	 //limite
    	 while(n>20) {
    		 System.out.println("Porfavor vuelva a introducir un numero dentro del limite permitido");
    		 this.n= cap.nextInt();
    	 
    	 
    	 while(n<0) {
    		 System.out.println("Porfavor vuelva a introducir un numero dentro del limite permitido");
    		 this.n= cap.nextInt();
    	 }
    	 }
     }
     
     public void serie() {
    	 for(i=0; i<n;i++) {
    		 System.out.print(num1+",");
    		 num3=num1+num2;
    		 num1=num2;
    		 num2=num3;
    	 }
    	 
    	 
     }

     
}
