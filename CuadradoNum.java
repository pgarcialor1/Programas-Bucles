package Proj3Bucles;

import java.util.Scanner;

/**
 * Write a description of class CuadradoNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuadradoNum
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce altura de matriz de numeros.");
        int alt = sc.nextInt();
        int num = 1;
        for(int fil=0; fil<alt; fil++){
            for(int col=0; col<alt; col++){
                System.out.printf("%d\t",num);
                num++;
            }
            System.out.println();
        }
    }
}
