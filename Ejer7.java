package ActUnidad3;


/**
 * Diseñar un programa que muestre el producto de los 10 primeros números impares
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer7
{
    public static void main(String[]args){
        for(int i = 0; i<=10; i++ ){
            if(!(i%2 == 0)){
                System.out.println(i);
            }
        }
    }
}
