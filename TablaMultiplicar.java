package Proj3Bucles;
import java.util.Scanner;


/**
 * Write a description of class TablaMultiplicar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TablaMultiplicar
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero.");
        int num = sc.nextInt();
        int cont;
        for(cont = 1; cont<=10; cont++ ){
            System.out.println(num+"x"+cont+"="+num*cont);
        }
    }
}
