/*
 * Realiza un conversor de Kb a Mb.

 * @author KuzaFkto
 */

import java.util.Scanner;
public class Ej11{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("Ingrese la cantidad de kilobits a pasar a megabits");
            double kb = sc.nextDouble();
            double mb = kb/1000.00;
            System.out.println(kb+" kilobits son "+ mb + " megabits ");
            sc.close();
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");
        }
       
    }
}