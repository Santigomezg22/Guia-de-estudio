/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author break
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner semana = new Scanner(System.in);      
        System.out.print("Ingrese un numero del 1 al 7 "); 
        int numeroDia = semana.nextInt(); 
        switch (numeroDia) {
            case 1:
                System.out.println("Hola soy el Dia lunes.");
                break;
            case 2:
                System.out.println("Hola soy el Dia martes.");
                break;               
            case 3:
                System.out.println("Hola soy el Dia miércoles.");
                break;               
            case 4:
                System.out.println("Hola soy el Dia jueves.");
                break;              
            case 5:
                System.out.println("Hola soy el Dia viernes.");
                break;                
            case 6:
                System.out.println("Hola soy el Dia sábado.");
                break;               
            case 7:
                System.out.println("Hola soy el Dia domingo.");
                break;     
            default:
                System.out.println("Numero no valido. Ingrese un numero del 1 al 7.");
        }
        semana.close();
    }
}
    
