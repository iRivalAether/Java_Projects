package U4Practicas;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Practica4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cap = new Scanner(System.in);
		String l;
		
		String a,b,c,d,f;
		
		
		f = JOptionPane.showInputDialog("Calculadora de areas de figuras:"+"\n"+"1.TRIANGULO"+"\n"+"2.CUADRADO"+"\n"+"3.RECTANGULO"+"\n"+"4.CIRCULO"+"\n"+"5.FIN"+"\n"+"ESCOGER OPCION");
		int xd= Integer.parseInt(f);
		
		switch(xd){
		   case 1:
			  a = JOptionPane.showInputDialog("Dame la base del triangulo");
			  double a1= Double.parseDouble(a);		   
			  b =JOptionPane.showInputDialog("Dame la altura del triangulo");
			  double b1= Double.parseDouble(a);	
			  Triangulo1  triangulo = new Triangulo1 (a1,b1 ,0, 0);
			  triangulo.Formula();
			  JOptionPane.showMessageDialog(null, triangulo.Formula());
			  break;
			   
		   case 2:
			  c =JOptionPane.showInputDialog("Dame el lado");
			  double c1= Double.parseDouble(c);	
			  Cuadrado1 cuadrado= new Cuadrado1(0,0,0,c1);
			  cuadrado.Formula();
			  JOptionPane.showMessageDialog(null, cuadrado.Formula());
			  break;
			  
		   case 3: 
			   a = JOptionPane.showInputDialog("Dame la base del triangulo");
			   double a2= Double.parseDouble(a);		   
			   b =JOptionPane.showInputDialog("Dame la altura del triangulo");
			   double b2= Double.parseDouble(a);	
			   Rectangulo1 rectangulo = new Rectangulo1(a2,b2,0,0);
			   rectangulo.Formula();
			   JOptionPane.showMessageDialog(null, rectangulo.Formula());
			   break;
			   
		   case 4 :   
			   d = JOptionPane.showInputDialog("Dame el radio del circulo");
			   double d1 = Double.parseDouble(d);
			   Circulo1 circulo = new Circulo1 (0,0,d1,0); 
			   circulo.Formula();
			   JOptionPane.showMessageDialog(null, circulo.Formula());
			   break;
			   
			default :
				JOptionPane.showMessageDialog(null, "El sistema se va a cerrar");
				
			   
		
			   

		
		
		
		}
		

	}

}
