/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarl;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class ContarL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = teclado.nextLine();

        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " veces.");
    }
}
    
    

