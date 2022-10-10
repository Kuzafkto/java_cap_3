/*
Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.

 * @author KuzaFkto
 */

import java.util.Scanner;
import java.lang.Math;
public class Ej3{
    public static void main(String[] args) {

        try {
            System.out.println("Ingrese la cantidad de pesetas a convertir en euros");
        Scanner sc = new Scanner (System.in);
        double pesetas = sc.nextFloat();
        System.out.println(pesetas + " pesetas a euros son " + Math.round(pesetas/166.38) + " euros");
    
        sc.close();
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");
        }
        
    }
 
}