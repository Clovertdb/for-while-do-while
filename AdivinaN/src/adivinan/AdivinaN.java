/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class AdivinaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(100) + 1; 
        int numero = 0;

        System.out.println("Adivina el numero entre 1 y 100");

        
        while (numero != secreto) {
            System.out.print("Escribe un numero: ");
            numero = teclado.nextInt();

            if (numero < secreto) {
                System.out.println("Muy bajo, intenta otra vez.");
            } else if (numero > secreto) {
                System.out.println("Muy alto, intenta otra vez.");
            } else {
                System.out.println("¡Correcto! Adivinaste el numero.");
            }
        }
    }
}
    
    

