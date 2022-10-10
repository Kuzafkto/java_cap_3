/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.

 *@author KuzaFkto 
 */

import java.util.Scanner;
public class Ej8{
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("Ingrese la cantidad de horas trabajadas");
            int hours = sc.nextInt();
            System.out.println("El salario semanal es de " + (12*hours)*5);
            sc.close();
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");
        }
       
    }
}