/*
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible.

 *@author KuzaFkto 
 */

import java.util.Scanner;
import java.lang.Math;
public class Ej7{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la base imponible");
        double fact = sc.nextDouble();
        System.out.println("La factura en base a la base imponible de " + fact + " euros es " + Math.round(fact*1.06));
        sc.close();
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");
        }
        
    }
}