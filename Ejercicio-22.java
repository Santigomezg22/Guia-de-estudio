/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author break
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner numfactorial = new Scanner(System.in);
                System.out.print("Ingrese un número");
        int num = numfactorial.nextInt();
        long factorial = calcularFactorial(num);
        System.out.println("El factorial de: " + num + " es: " + factorial);
        numfactorial.close();
    }
    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
    
