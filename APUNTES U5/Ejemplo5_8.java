package U5Ejemplos;
import javax.swing.JOptionPane;
public class Ejemplo5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		int n=0;
		try {
			cadena=JOptionPane.showInputDialog("Ingresa un numero;:");
			n=Integer.parseInt(cadena);
			n=n/0;
		}catch(ArithmeticException e) {
			System.out.println("Error Aritmetico "+e.getMessage());
		}catch(NumberFormatException e) {
			n=1;
			System.out.println("Error de conversion "+e.getMessage());
		}
		System.out.println(n);
	}

}
