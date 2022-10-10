/*
 * 
 * Realiza un conversor de Mb a Kb.

 *@author KuzaFkto
 */

import java.util.Scanner;
public class Ej10{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("Ingrese la cantidad de megabits a pasar a kilobits");
            double mb = sc.nextDouble();
            double kb = mb*1000.00;
            System.out.println(mb+" megabits son "+ kb + " kilobits ");
            sc.close();
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");
        }
       
    }
}