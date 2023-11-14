package Proj3Bucles;

import java.util.Scanner;

/**
 * Write a description of class DiagonalNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuadradoNumPar
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres");
        int num;
        do{
            System.out.println("Introduce altura de matriz de numeros.");
            int alt = sc.nextInt();
            num = 1;
            for(int fil=0; fil<alt; fil++){
                    for(int col=0; col<alt; col++){
                        if(num%2==0){
                        System.out.printf("%3d",num);
                        
                    }else{
                        System.out.printf("%3s","*");
                    }
                    num++;
                }
                
                System.out.println();
            }
        }while(num<0);
        System.out.println("FIN DEL PROGRAMA");
            
        
        
    }
}
