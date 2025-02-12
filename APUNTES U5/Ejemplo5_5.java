package U5Ejemplos;

public class Ejemplo5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		try {
			n=9/0;
		}
		catch(Exception e){
			if(e instanceof ArithmeticException)
				System.out.println("Error Aritmetico"+e.getMessage());
		}
		finally {
			n=1;
		}
		System.out.println(n);
		

	}

}
