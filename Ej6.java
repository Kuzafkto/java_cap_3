/*
 * 
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la base");
        double length = sc.nextDouble();
        System.out.println("Ingrese la altura");
        double width = sc.nextDouble();
        System.out.println("El area del triangulo es " + (length * width)/2);
    
        sc.close();
        
    }
}