package ActUnidad3;
import java.util.Scanner;


/**
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer13
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int aprobado=0;
        int condicionado=0;
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
                    aprobado++;
                    break;
                case 4:
                    condicionado++;
                    break;
                case 3:
                case 2:
                case 1:
                case 0:
                   suspenso++;
                    break;
            }
            cont++;
        }while(cont<6);
        if(suspenso>0){
            System.out.printf("%s %d %s","Hay",suspenso,"suspensos en las calificaciones");
            System.out.println();
        }
        if(condicionado>0){
            System.out.printf("%s %d %s","Hay",condicionado,"condicionados en las calificaciones");
            System.out.println();
        }
        if(aprobado>0){
            System.out.printf("%s %d %s","Hay",aprobado,"aprobados en las calificaciones");
            System.out.println();
        }
    }
}
