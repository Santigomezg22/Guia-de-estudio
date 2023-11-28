/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author break
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner tablas = new Scanner(System.in);

        System.out.print("Añade el numero que quieres ver su tabala de multiplicar: ");
        int num = tablas.nextInt();
        mostarTabla(num);
        tablas.close();
    }
    public static void mostarTabla(int numero) {
        System.out.println("La tabla de multiplicar del: " + numero + "es:");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}

    
