package ActUnidad3;
import java.util.Scanner;
import java.util.Random;


/**
 * Realizar el juego el número secreto, que consiste en acertar un número desconocido
 * (generado aleatoriamente entre 1 y 100). Para ello se leen por teclado una serie de
 * números, para los que se indica: “mayor” o “menor”, según sea mayor o menor con respecto
 * al número secreto. El proceso termina cuando el usuario acierta o cuando se
 * rinde(introduciendo un -1).
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer3
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(100)+1;
        do{
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            if(num<numAleatorio){
                System.out.println("El numero "+num+" es MENOR");
            }else if(num>numAleatorio){
                System.out.println("El numero "+num+" es MAYOR");
            }else{
                System.out.println("HAS GANADO");
            }
        }while(num!=numAleatorio||num==-1);        
    }
}
