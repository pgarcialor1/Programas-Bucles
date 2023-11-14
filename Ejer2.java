package ActUnidad3;
import java.util.Scanner;
import java.lang.Math;


/**
 * Un centro educativo nos ha pedido que diseñemos una aplicación para
 * calcular algunos datos estadísticos de las edades de los alumnos.
 * Se introducirán datos hasta que uno de ellas sea negativo. La aplicación
 * mostrará la suma de todas las edades, la media, de cuántos alumnos 
 * hemos introducido las edades y cuántos alumnos son mayores de edad.
 * Implementar la aplicación requerida.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer2
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int edad = 0;
    int suma = 0;
    int contador = 0;
    int mayores = 0;
    double media = 0;

    do {
      System.out.print("Introduce la edad del alumno: ");
      edad = sc.nextInt();
      
      if (edad >= 0) {
        suma += edad;
        contador++;
        if (edad >= 18) {
          mayores++;
        }
      }
    } while (edad >= 0);
    
    if (contador > 0) {
      media = (double) suma / contador;
    }

    System.out.println("La suma de todas las edades es: " + suma);
    System.out.println("La media de las edades es: " + media);
    System.out.println("El número de alumnos es: " + contador);
    System.out.println("El número de alumnos mayores de edad es: " + mayores);
  }
}

