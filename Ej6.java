/*
 * 
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la base");
        double length = sc.nextDouble();
        System.out.println("Ingrese la altura");
        double width = sc.nextDouble();
        System.out.println("El area del triangulo es " + (length * width)/2);
    
        sc.close();
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");
        }
        
    }
}