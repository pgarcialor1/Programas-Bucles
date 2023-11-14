package Proj3Bucles;
import java.util.Scanner;


/**
 * Write a description of class Dibujar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DibujarCuadrado
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado.");
        int tamano = sc.nextInt();
        for(int c=0;c<=tamano;c++){
            System.out.println("");
            for(int i=c;i<=tamano-1;i++){
                if(i<=tamano||){
                    System.out.print("*");
                }
                
            }
        }
    }
}
