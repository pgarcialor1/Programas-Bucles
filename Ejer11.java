package ActUnidad3;
import java.util.Scanner;


/**
 * Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer11
{
    public static void main(String[]args){           
        for(int i=1; i<=10; i++){
            for(int num=1; num<=10; num++){
                System.out.printf("%d %s %d %s %d",num," x ",i," = ",num*i);
                System.out.println();
            }
            System.out.println("-".repeat(20));
        }
    }
}
