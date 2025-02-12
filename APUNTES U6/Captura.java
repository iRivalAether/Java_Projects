package U6Ejemplos;
import java.io.FileWriter;
import java.io.IOException;
public class Captura {

	private String texto;
	
	public Captura (String texto) {
		this.texto=texto;
	}
	
	public void guardar() {
		try {
		FileWriter archivo= new FileWriter("contenidos.txt");
		archivo.write(texto);
		archivo.close();
		}catch(IOException e) {
			System.out.println("Ocurrio un error en la escritura");
		}
	}
}
