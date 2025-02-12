package U5Ejemplos;
import javax.swing.JOptionPane;
public class Ejemplo5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		int n=0;
		try {
			cadena=JOptionPane.showInputDialog("Ingrese un numero:");
			n=Integer.parseInt(cadena);
			n=7/0;
		}catch(Exception e){
			if(e instanceof ArithmeticException)
				System.out.println("Error Aritmetico"+e.getMessage());
			else
				if(e instanceof NumberFormatException)
					System.out.println("Error de conversion"+e.getMessage());
			n=1;
			
		}
		System.out.println(n);

	}

}
