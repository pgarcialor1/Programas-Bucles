package ActUnidad3;
import java.util.Scanner;
import java.lang.Math;


/**
 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5!
 * Y es igual a 5x4x3x2x1=120.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer8
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int total;
        int almacen = 1;
        for(int i=num; i>=1; i--){
            almacen*=i;
            
        }
        
        System.out.printf("%s %d%s %s %d","El factorial de",num,"!","es:",almacen);
        
    }
}
