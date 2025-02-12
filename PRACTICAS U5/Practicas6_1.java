package U6Practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Practicas6_1 {
    private static final String pase = "Materia";
    private static File file;
    private static FileWriter writer;
    private static int capacidad = 0;
    private static int[] alumnos;

    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        try (Scanner cap= new Scanner(System.in)) {
            System.out.println("Ingrese que opcion desea escoger:");
            System.out.println("1. Agregar materia");
            System.out.println("2. Agregar alumnos");
            System.out.println("3. Pase de lista");
            System.out.println("4. Terminar el programa");
            int opcion = cap.nextInt();
            Validar(opcion);
            switch (opcion) {
                case 1:
                    agregarMateria(cap);
                    break;
                case 2:
                    agregarAlumno();
                    break;
                case 3:
                    paseDeLista();
                    break;
                case 4:
                    System.out.println("Terminando el programa...");
                    return;
            }
            menu();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void Validar(int opcion) throws IllegalArgumentException {
        if (opcion<1||opcion>4) {
            throw new IllegalArgumentException("El valor no esta permitido");
        }
    }

    private static void agregarMateria(Scanner scanner) throws IOException {
        System.out.println("Introduzca el nombre de la materia que quieran agregar:");
        String materia = scanner.next();
        System.out.println("Introduzca el nombre del profesor que va a impartir la materia:");
        String profesor = scanner.next();
        System.out.println("Introduzca cuantos alumnos es el limite de la materia:");
        int capacidadMateria = scanner.nextInt();
        alumnos = new int[capacidadMateria];

        file = new File(pase);
        writer = new FileWriter(pase);
        writer.write("Materia:" + materia + "\n" + "Nombre del profesor:" + profesor + "\n" + "Capacidad de la clase:" + capacidadMateria);
        writer.close();
    }

    private static void agregarAlumno() throws IOException {
        try (Scanner cap= new Scanner(System.in)) {
            System.out.println("Introduce la materia a la que quieres agregar un alumno:");
            String materia = cap.nextLine();

            FileReader reader = new FileReader(pase);
            BufferedReader br = new BufferedReader(reader);
            String line;
            boolean found = false;
            int alumnoNumber=1;
            //try and catch
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Materia:" + materia)) {
                    found = true;
                    System.out.println("Introduce el nombre y ID del alumno a agregar (separados por un espacio):");
                    String nombre = cap.next();
                    int id = cap.nextInt();
                    FileWriter writer = new FileWriter(pase, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    while ((line = br.readLine()) != null) {
                        if (line.startsWith("Alumno:")) {
                            alumnoNumber++;
                        }
                        bufferedWriter.write(line + "\n");
                    }
                    bufferedWriter.write("Alumno:" + alumnoNumber + ":Nombre:" + nombre + ":ID:" + id + "\n");
                    bufferedWriter.close();
                    System.out.println("Alumno agregado exitosamente como Alumno " + alumnoNumber + ".");
                    break;
                }
            }
            if (!found) {
                System.out.println("No se encontró la materia.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static void paseDeLista() throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce la materia para la que quieres hacer el pase de lista:");
            String materia = scanner.nextLine();

            FileReader reader = new FileReader(pase);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            boolean found = false;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("Materia:" + materia)) {
                    found = true;
                    int[] alumnos = new int[capacidad];
                    for (int i = 0; i < capacidad; i++) {
                        alumnos[i] = i;
                    }
                    System.out.println("Lista de alumnos:");
                    for (int alumno : alumnos) {
                        System.out.println((alumno + 1) + ". Alumno " + alumno);
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("No se encontró la materia.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}