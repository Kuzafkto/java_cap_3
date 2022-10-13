/*
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible.

 *@author KuzaFkto 
 */

import java.util.Scanner;
import java.lang.Math;
public class Ej7{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la base imponible");
        double fact = sc.nextDouble();
        System.out.println("La factura en base a la base imponible de " + fact + " euros es " + Math.round(fact + fact*0.21));
        sc.close();
        
    }
}