package Proj3Bucles;
import java.util.Scanner;


/**
 * Agua 1.00
 * patatas 1.50
 * coca 1.20
 * Cada vez que entremos a la tienda compraremos uno de esos productos pero tenemos
 * una restriccion:
 * nuestra abuela solo nos ha dado 20€, cuando nos quedemos sin dinero o notengamos 
 * suficiente para comprar ninguno de esos productos mostraremos lo que nos resta y 
 * finalizaremos el programa.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tienda
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double dinero = 10.0;
        int select;
        double agua = 1.0;
        double patata = 1.50;
        double coca = 1.20;
        String opcion = "Seleccion denegada";
        while(dinero>=1.0){
            menu();
                do{
                select = sc.nextInt();
                switch(select){
                    case 1:
                        if(dinero>=agua){
                            dinero-=agua;
                        }else{
                            System.out.println("Dinero insuficiente");
                        }
                        break;
                    case 2:
                        if(dinero>=patata){
                            dinero-=patata;
                        }else{
                            System.out.println("Dinero insuficiente");
                        }
                        break;
                    case 3:
                        if(dinero>=coca){
                            dinero-=coca;
                        }else{
                            System.out.println("Dinero insuficiente");
                        }
                        break;
                    default:
                        System.out.println(opcion);
                }
            }while(select<4&&select<0);
            System.out.printf("%.2f%s %s\n", dinero,"€","Te queda" );
            System.out.println();
        }
    }
    public static void  menu(){
        String tienda = "Alimentacion mirella";
        System.out.printf("%10s\n","=".repeat(tienda.length()));
        System.out.printf("%10s\n","ALIMENTACION MIRELLA");
        System.out.printf("%10s\n","=".repeat(tienda.length()));
        System.out.printf("%-10s:%10s\n","1. Agua","1.00");
        System.out.printf("%-10s:%10s\n","2. Patatas","1.50");
        System.out.printf("%-10s:%10s\n","3. Coca","1.20");     
        System.out.printf("%10s\n","=".repeat(tienda.length()));
        
    }
    
}
