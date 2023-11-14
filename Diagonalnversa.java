package Proj3Bucles;

import java.util.Scanner;

/**
 * Write a description of class Diagona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diagonalnversa
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce altura de matriz de numeros.");
        int alt = sc.nextInt();
        int contador=1;
        for(int fil=0; fil<alt; fil++){
            for(int col=0; col<alt; col++){
                if(col<alt-contador||col>alt-contador){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            contador++;
        }
    }
}
