package Proj3Bucles;
import java.util.Scanner;

/**
 * Write a description of class ConvierteNumero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConvierteNumero
{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número");
        int numero = sc.nextInt();
        numero = Math.abs(numero);
        // int suma = sumarCifras(numero);
        System.out.printf("Suma de las cifras %10d = %10d\n",(numero),sumarCifras(numero));
        // for(int i=10;i<20;i++){
            // System.out.printf("Suma del numero %10d = %10d\n",(numero+i),sumarCifras(numero+i));

        // }
         System.out.printf("El Binario del numero %10d = %10d\n",(numero),convierteBinario(numero));
         System.out.printf("El Hexadecimal del numero %10d = %10s\n",(numero),convierteHex(numero));

    }

    public static  int sumarCifras(int numerito){
        int suma = 0;  
        while(numerito!=0){
            int digito= numerito%10; // recoge las unidades
            suma+=digito; // Acumula la suma de las cifras
            numerito/=10;
        }
        // System.out.printf("Suma= %10d",suma);
        return suma;
    }

    public static long convierteBinario(int numero){
        int multiplicador = 1;
        int resultadoBinario=0;

        while(numero>=1){
            int resto =numero%2; // 7%2=1 3%2=1
            resultadoBinario = resultadoBinario +resto*multiplicador; // 0+1*1=1 1+1*10=11
            multiplicador=multiplicador*10; //1*10 10*10=100
            numero=numero/2; // 7/2=3 3/2 =1
        }
       // resultadoBinario+=numero*multiplicador;
        return resultadoBinario;
    }
    
    public static String convierteBinarioS(int numero){
        int multiplicador = 1;
        String resultadoBinario="";

        while(numero>=1){
            int resto =numero%2; // 7%2=1 3%2=1
            resultadoBinario = resultadoBinario+resto;
            numero=numero/2; // 7/2=3 3/2 =1
        }
        resultadoBinario=resultadoBinario+numero*multiplicador;
        return resultadoBinario;
    }
    
    public static String convierteHex(int numero){
        String hexadecimal ="";
        String aux="";
        int resto =numero%16;
            while(numero>0){
            switch(resto){
                case 10:
                    aux="A";
                    break;
                case 11:
                    aux="B";
                    break;
                case 12:
                    aux="C";
                    break;
                case 13:
                    aux="D";
                    break;
                case 14:
                    aux="E";
                    break;
                case 15:
                    aux="F";
                    break;
                default:
                    aux=" "+resto;
            }
            hexadecimal =aux +hexadecimal;
            numero= numero/16;
        }
        return hexadecimal;
    }

}

