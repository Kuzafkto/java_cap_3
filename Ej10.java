/*
 * 
 * Realiza un conversor de Mb a Kb.

 *@author KuzaFkto
 */

import java.util.Scanner;
public class Ej10{
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Ingrese la cantidad de megabits a pasar a kilobits");
            double mb = sc.nextDouble();
            double kb = mb*1000.00;
            System.out.println(mb+" megabits son "+ kb + " kilobits ");
            sc.close();
        
    }
}