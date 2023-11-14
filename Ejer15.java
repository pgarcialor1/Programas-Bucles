package ActUnidad3;
import java.util.Scanner;


/**
 * Realizar un programa que nos pida un número n y nos diga cuantos números hay entre 1
 * y n que sean primos. Un número primo es aquél que sólo es divisible por 1 y por él mismo. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer15
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int contador = 0;
        for(int i=1; i<=num; i++){
            boolean esPrimo = true;
            
            if(!(i%2==0)||i==2){
                System.out.printf("%d %s",i,"es primo");
            }else if(i%2==0){
                esPrimo = false;
                System.out.printf("%d %s",i,"NO es primo");
            }
            
            
            System.out.println();
            if(esPrimo==true && i!=1){
                contador++;
            }
        }
        System.out.println("Hay " + contador + " números primos entre 1 y " + num );
    }
}
