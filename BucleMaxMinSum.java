package Proj3Bucles;
import java.util.Scanner;


/**
 * Write a description of class BucleMaxMinSum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BucleMaxMinSum
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        while(num != -99){
            //System.out.println("Introduce un numero");
            num = sc.nextInt();
            int mayor = num;
            int menor = num;
            int total = 0;
            
            System.out.println(total);
            
            if(num < menor){
                menor = num;
            }else if(num>mayor && num>menor){
                mayor = num;
            }
            
            int suma = num + total;
            System.out.println(suma);
            System.out.println(menor);
            System.out.println(mayor);
        }
        
    }
}
