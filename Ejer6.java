package ActUnidad3;


/**
 * Escribir todos los múltiplos de 7 menores que 100.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejer6
{
    public static void main(String[]args){
        int num = 7;
        for(int i = 0; num*i<100; i++ ){
            int mult=num*i;
            if(mult%7 == 0){
                System.out.println(num*i);
            }
        }
    }
}
