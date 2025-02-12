package U5Ejemplos;

public class Ejemplo5_9 {

	public static int evaluar(String c1, String c2) throws Exception {
		int v1=Integer.parseInt(c1);
		int v2=Integer.parseInt(c2);
		if((v1>20)||(v2<-4))
			throw new Exception("Valores fuera de rango");
			return (v1/v2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="4";
		String str2="5";
		String respuesta;
		int valor;
		
		try {
			valor=evaluar(str1,str2);
			respuesta=String.valueOf(valor);
		}catch(NumberFormatException e) {
			respuesta="No se puede realizar la conversion";
		}catch(ArithmeticException e) {
			respuesta="No se puede realizar una division por cero";
			
		}catch(Exception e) {
			respuesta=e.getMessage();
		}
		System.out.println(respuesta);
		

	}

}
