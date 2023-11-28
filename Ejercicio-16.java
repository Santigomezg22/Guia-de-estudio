/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

import java.util.Scanner;

/**
 *
 * @author break
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner circulo = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo ");
        double radio = circulo.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo es " + area);
        circulo.close();
    }
}
