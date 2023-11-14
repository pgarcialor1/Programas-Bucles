package ActUnidad3;
import java.util.Scanner;


/**
 * Se desea implementar una aplicación que pida al usuario que introduzca un número comprendido
 * entre 1 y 10. Debemos mostrar la tabla de multiplicar de dicho número. El código tendrá que
 * asegurarse de que el número introducido se encuentra entre el 1 y el 10.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer10
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Introduce un numero entre el 1 y el 10");
            num = sc.nextInt();
            for(int i=1; i<=10; i++){
                System.out.printf("%d %s %d %s %d",num," x ",i," = ",num*i);
                System.out.println();
            }
        }while(num>1&&num<10);
        
    }
}
