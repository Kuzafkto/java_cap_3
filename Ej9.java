/*
Escribe un programa que calcule el volumen de un cono según la fórmula V =
1/3πr*rh
 *
 * @author KuzaFkto
 */

import java.util.Scanner;
import java.lang.Math;
public class Ej9{
    public static void main(String[] args) {
        
            Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese la altura del cono");
        double h = sc.nextDouble();
        System.out.println("Ingrese el radio del cono");
        double r = sc.nextDouble();
        double v = (1.0/3.0)*Math.PI*Math.pow(r,2)*h;
        System.out.printf("El volumen del cono es de 1/3 * " + " pi * " + r+ "²" + " * "+ h + " = " + v );
        sc.close();
        
        
    }
}