package ActUnidad3;
import java.util.Scanner;


/**
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer12
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int suspenso=0;
        int cont=0;
        do{
            System.out.println("Insterta una nota");
            int nota = sc.nextInt();
            switch(nota){
                case 10:
                case 9:
                case 8:
                case 7:
                case 6:
                case 5:
                    break;
                    
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                   suspenso++;
                    break;
            }
            cont++;
        }while(cont<5);
        if(suspenso>0){
            System.out.printf("%s %d %s","Hay",suspenso,"suspensos en las calificaciones");
        }
    }
}
