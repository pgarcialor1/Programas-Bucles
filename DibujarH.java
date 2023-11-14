package Proj3Bucles;
import java.util.Scanner;


/**
 * Write a description of class DibujarH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DibujarH
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la H.");
        int tamano = sc.nextInt();
        for(int colum=0;colum<tamano;colum++){
            System.out.print("*");
            if(colum==tamano/2){
                for(int fila=0;fila<tamano-2;fila++){
                    System.out.print("*");            
                }
            }else{
                for(int fila=0;fila<tamano-2;fila++){
                    System.out.print(" ");            
                }
            }
            System.out.println("*");
        }
    }
}
