/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.

 * 
 * @author KuzaFkto
 */

import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args) {
     
            Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese un número");
        float x = sc.nextFloat();
        System.out.println("Ingrese otro número");
        float y = sc.nextFloat();
        System.out.printf( "x + y = %.1f \n",x+y);
        System.out.printf( "x - y = %.1f \n",x-y);
        System.out.printf( "x * y = %.1f \n",x*y);
        if (y!=0){
            System.out.printf( "x / y = %.f \n",x/y);
        }else{
            System.out.println("No se puede dividir por 0");
        }

        sc.close();
        
        
    }
}