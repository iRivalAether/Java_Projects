package U5Ejemplos;

public class Ejemplo5_6 {
	
	public static int dividir() {
		int n=0;
		try {
			n=8/0;
		}catch(Exception e){
			n=1;
			if(e instanceof ArithmeticException)
				System.out.println("Error Aritmetico"+e.getMessage());
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=dividir();
		System.out.println(numero);

	}

}
