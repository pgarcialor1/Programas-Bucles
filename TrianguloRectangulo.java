package Proj3Bucles;
import java.util.Scanner;


/**
 * Write a description of class Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrianguloRectangulo
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la altura");
        int altura = sc.nextInt();     
        String simbolo = "*";
        for(int col=0; col<=altura;col++){
            for(int fila=0;fila<=col-1;fila++){
                if(fila<(altura/2)-1|| col<=(altura/2)+1 || col>(altura/2)-1 ){
                    System.out.printf("%s ",simbolo);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
    }
}
