/*
 * Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.

 * @author KuzaFkto
 */

import java.util.Scanner;
public class Ej1{
public static void main(String[] args) {
    try {
        Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese un número");
    int x = sc.nextInt();
    System.out.println("Ingrese otro número");
    int y = sc.nextInt();
    System.out.println(x + " X " + y+ " = "+ x*y);
    sc.close();
    } catch (Exception e) {
        System.out.println("Error! ");
        System.out.println("Por favor, ejecute el código de nuevo");
    }
    
}
}   