/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author break
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner nums = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        int num = nums.nextInt();
        if (num > 0) {
            System.out.println("El numero ingresado es positivo.");
        } else if (num < 0) {
            System.out.println("El numero ingresado es negativo.");
        }
        nums.close();
    }
}
