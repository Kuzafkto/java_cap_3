/*
 * Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.

 * @author KuzaFkto
 */

import java.util.Scanner;
public class Ej1{
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese un número");
    int x = sc.nextInt();
    System.out.println("Ingrese otro número");
    int y = sc.nextInt();
    System.out.println(x + " X " + y+ " = "+ x*y);
    sc.close();
}
}   