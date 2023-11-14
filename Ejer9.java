package ActUnidad3;
import java.util.Scanner;


/**
 * Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál
 * es el árbol más alto.Para ello se introducirá por teclado la altura (en centímetros) de
 * cada árbol (terminando cuando se utilice -1 como altura). Los arboles se identifican 
 * mediante etiquetas con números únicos correlativos, comenzando en 0. Se pide diseñar una
 * aplicación que resuelva el problema planteado.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer9
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double altura;
        int arbol = 0;
        double arbolMax = 0.0;
        do{
            System.out.print("Altura del arbol: ");
            altura = sc.nextDouble();
            if(altura>arbolMax){
                arbolMax = altura;
            }
            System.out.println(arbol+". "+altura);
            arbol++;
        }while(altura != -1);
        System.out.println("Arbol mas alto"+arbolMax);
        
    }
}
