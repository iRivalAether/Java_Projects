package U6Practicas;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class Practicas6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File archivo = new File ("Cadena.txt");
			archivo.createNewFile();
            FileWriter w = new FileWriter("Cadena.txt");
            w.write("Ingenieria EN SISTEMAS");
            w.close();


            FileReader r = new FileReader("Cadena.txt");
            BufferedReader br = new BufferedReader(r);
            String linea;
            int contador = 0;
            while ((linea = br.readLine())!= null) {
                for (char c : linea.toCharArray()) {
                    c = Character.toLowerCase(c);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        contador++;
                    }
                }
            }
            br.close();

            System.out.println("Numero de vocales: " + contador);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

	}


