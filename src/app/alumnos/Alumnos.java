package app.alumnos;

import alumno.Alumno;
import java.util.Scanner;
/**
 * En esta Clase comprobaremos el uso de la aplicacion para gestionar los alumnos
 * 
 * @author Carlos Arjona Badia
 */
public class Alumnos {
    /**
     * En el main llamaremos al resto de funciones para introducir alumnos y consultar las notas
     * 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Define la estructura, un array de 5 alumnos
        // pero no crea los objetos
        Alumno[] alum = new Alumno[5];

        introducirAlumno(alum, entrada);
        double sumaDeNotas = sumaNotas(alum);

        System.out.println("La media global de la clase es " + sumaDeNotas / alum.length);
    }
    /**
     * Este metodo ingresara a los alumnos al array con los datos pertinentes.
     * @param alum Es el array donde guardaremos los alumnos
     * @param entrada Es el teclado definido en el main.
     * @throws NumberFormatException 
     */
    private static void introducirAlumno(Alumno[] alum, Scanner entrada) throws NumberFormatException {
        // Pide los datos de los alumnos /////////////////////////////////

        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");

        String nombreIntroducido;
        double notaIntroducida;

        for (int i = 0; i < alum.length; i++) {
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            alum[i] = new Alumno(nombreIntroducido, notaIntroducida);
        } // for i
    }
    /**
     * Este metodo sumara todas las notas para hacer la media en el main
     * @param alum Es el array donde se guardan los alumnos
     * @return Devolvemos la suma de todas las notas de los alumnos
     */
    private static double sumaNotas(Alumno[] alum) {
        // Muestra los datos de los alumnos /////////////////////////////////

        System.out.println("Los datos introducidos son los siguientes:");
        double sumaDeNotas = 0;
        for (int i = 0; i < alum.length; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + alum[i].getNombre());
            System.out.println("Nota media: " + alum[i].getNota());
            System.out.println("----------------------------");

            sumaDeNotas += alum[i].getNota();
        } // for i
        return sumaDeNotas;
    }
}
