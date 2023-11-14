package ActUnidad3;
import java.util.Scanner;


/**
 * Desarrollar un programa que solicite los valores mínimos y máximo de un rango.
 * A continuación, solicitará por teclado un número que debe estar dentro del rango.
 * Si el valor introducido no pertenece al rango, la aplicación volverá a pedir otro 
 * valor, y así repetidas veces, hasta que el valor se encuentre dentro del rango.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer5
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero minimo");
        int numMin = sc.nextInt();
        System.out.println("Introduce un numero maximo");
        int numMax = sc.nextInt();
        int num;
        do{
            System.out.println("Introduce un numero dentro del rango: "+numMin+" - "+numMax);
            num = sc.nextInt();
        }while(!(num<=numMax&&num>=numMin));
    }
}
