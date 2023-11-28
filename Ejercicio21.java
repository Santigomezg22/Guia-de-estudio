/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author break
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int opcion;
        do {
            // Mostrar menú
            System.out.println("Menu de la Taqueria Don bigotes");
            System.out.print("Ingrese el numero de la opcion deseada: ");
            System.out.println("1. Taco al pastor");
            System.out.println("2. Taco de longaniza");
            System.out.println("3. Taco de chorizo");
            System.out.println("4. Salir");
            opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado Taco al pastor");
                    break;
                case 2:
                    System.out.println("Has seleccionado Taco de longaniza");
                    break;
                case 3:
                    System.out.println("Has seleccionado Taco de chorizo");
                    break;
                case 4:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Opcion no válida. Por favor, elige una opción del menu.");
            }

        } while (opcion != 4);

        menu.close();
    }
}
