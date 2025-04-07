/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosimpares;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class NumerosImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int numero, i = 1;

        System.out.print("Ingresa un numero entero positivo: ");
        numero = teclado.nextInt();

        System.out.println("numeros impares desde 1 hasta " + numero + ":");

        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);
    }
}
    
    

