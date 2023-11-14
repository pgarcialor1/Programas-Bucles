package ActUnidad3;
import java.util.Scanner;
import java.lang.Math;


/**
 * Diseñar un programa que muestre, para cada número introducido por teclado,
 * si es par, si es positivo y su cuadrado. El proceso se repetirá hasta que
 * el número introducido por teclado sea 0.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer1
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            if(num%2==0){
                System.out.println("El numero "+num+" es par");
            }else{
                System.out.println("El numero "+num+" es impar");
            }
            if(num>0){
                System.out.println("El numero "+num+" es positivo");
            }else{
                System.out.println("El numero "+num+" es negativo");
            }
            System.out.println("Elevado al cuadrado es: "+Math.pow(num,2));
            System.out.println();
        }while(num!=0);
    }
}
