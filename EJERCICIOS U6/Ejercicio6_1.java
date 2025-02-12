package U6Ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import U6Ejemplos.Captura;
public class Ejercicio6_1 {

   static File archivo;
	static String text;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 crearArchivito();
		 crearDirectorio();
	      escritura();
	      lectura();
		
	}
	
	public static void crearArchivito() {
	
		try {
	
			archivo= new File("Archivito.txt");
			if(archivo.createNewFile()) {
				System.out.println("Nombre:"+archivo.getName());
				System.out.println("Ruta Absoluta:"+archivo.getAbsolutePath());
				System.out.println("Tamaño:"+archivo.length());
				System.out.println("Se puede leer:"+archivo.canRead());
				System.out.println("Se puede escribir:"+archivo.canWrite());
			}
			else {
				System.err.println("El archivo ya existe");
			
			}
			
		}catch(Exception ex){
			System.err.println("Ocurrio un error");
			
		}
	}
	
	public static void crearDirectorio() {
		try {
			archivo= new File("Archivote");
			if(archivo.mkdir()) {
					System.out.println("Es un directorio:"+archivo.isDirectory());
					System.out.println("Ruta:"+archivo.getAbsolutePath());
				
				}
				else 
					System.err.println("El directorio ya existe...");
			}catch(Exception ex){
				System.err.println("Ocurrio un error");
			}
		}
	
	public static void escritura() {
		String texto;
		Scanner cap = new Scanner (System.in);
		System.out.println("Escribe lo que quieras en el documento");
		texto= cap.nextLine();
		
		try {
			FileWriter archivo= new FileWriter("archivito.txt");
			archivo.write(texto);
			archivo.close();
			
			}catch(IOException e) {
				System.out.println("Ocurrio un error en la escritura");
			}
		
	}
	
	public static void lectura() {
		String cadena;
		try {
			FileReader archivo = new FileReader("archivito.txt");
			BufferedReader leer = new BufferedReader(archivo);
			cadena=leer.readLine();
			
			while(cadena!=null) {
				System.out.println(cadena);
				cadena = cadena.trim();
				cadena=leer.readLine();
				
			}
			archivo.close();
			leer.close();
			
		}catch(IOException e) {
			System.err.println("Error no es posible leer el archivo");
		}
		
	}
	}
