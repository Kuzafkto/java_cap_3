/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.

Ejemplo 1:
Introduce la nota del primer examen: 7
¿Qué nota quieres sacar en el trimestre? 8.5
Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.


Ejemplo 2:
Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 *
 * @author KuzaFkto
 */

import java.util.Scanner;
public class Ej12{
 public static void main(String[] args) {
   try {
      Scanner sc = new Scanner (System.in);
      System.out.println("Ingrese la nota del primer examen");
      double firstex = sc.nextFloat();
      System.out.println("¿Que nota quieres sacar en en el trimeste?");
      double desiredGrade= sc.nextFloat();
      double needednote = (desiredGrade-firstex*0.40)/0.60;
  
      System.out.println("Para tener un " + desiredGrade+ " en el trimestre necesitas sacar un " +  needednote + " en el examen");
      sc.close(); 
   } catch (Exception e) {
       System.out.println("Error! ");
       System.out.println("Por favor, ejecute el código de nuevo");
   }
   
 }
}