/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.

 * 
 * @author KuzaFkto
 */

import java.util.Scanner;
public class Ej4{
    public static void main(String[] args) {
     
            Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese un número");
        int x = sc.nextInt();
        System.out.println("Ingrese otro número");
        int y = sc.nextInt();
        System.out.println( x + " + " + y + " = "+ x+y );
        System.out.println( x +" - " + y + " = " + (x-y));
        System.out.println( x +" * " + y + " = " + x*y);
        System.out.println( x +" / " + y + " = " + x/y);

        sc.close();
        
        
    }
}