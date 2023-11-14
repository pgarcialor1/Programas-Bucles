package ActUnidad3;
import java.util.Scanner;


/**
 * Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
 * todos los números del 1 al n
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer4
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            System.out.print(i+" ");            
        }
    }
}
