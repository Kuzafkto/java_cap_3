/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.

 *@author KuzaFkto 
 */

import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args) {

        
            Scanner sc = new Scanner (System.in);
            System.out.println("Ingrese la cantidad de horas trabajadas");
            int hours = sc.nextInt();
            System.out.println("El salario semanal es de " + (12*hours)*5);
            sc.close();
        
       
    }
}