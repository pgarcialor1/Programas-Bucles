package ActUnidad3;
import java.util.Scanner;


/**
 * Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
 * utilizando para ello asteriscos (*).
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer14
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura del triangulo rectangulo: ");
        int altura = sc.nextInt();
        for(int fila=1; fila<=altura; fila++){
            for(int col=1; col<=fila; col++){
                if(col<=altura){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
