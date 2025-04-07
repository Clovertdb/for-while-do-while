/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalnvocal;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class VocalNVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        char letra;

        System.out.println("Escribe letras. Escribe un espacio para salir.");

        do {
            System.out.print("Ingresa una letra: ");
            letra = teclado.next().charAt(0); 

            
            letra = Character.toLowerCase(letra);

            if (letra == ' ') {
                System.out.println("Programa terminado.");
            } else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("Es una vocal.");
            } else {
                System.out.println("Es una consonante.");
            }

        } while (letra != ' ');
    }
}
    
    

