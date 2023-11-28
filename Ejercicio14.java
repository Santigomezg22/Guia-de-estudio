/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author break
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ficha = new Scanner(System.in);
        System.out.println("**Ingresa tu edad**");
        String edad = ficha.nextLine();
        System.out.println("**Ingresa tu nombre**");
        String nombre = ficha.nextLine();
        System.out.println("**Ingresa tu numero de telefono**");
        String telefono = ficha.nextLine();
        System.out.println("**Ingresa tu correo electronico**");
        String correo = ficha.nextLine();

        System.out.println("Ficha de Contacto:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Edad: " + edad);

        ficha.close();

    }
}
