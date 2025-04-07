/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciacuadros;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class SecuenciaCuadros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int numero, i = 1;

        System.out.print("Ingresa un numero entero positivo: ");
        numero = teclado.nextInt();

        System.out.println("Cuadrados del 1 al " + numero + ":");

        do {
            System.out.println(i + " x " + i + " = " + (i * i));
            i++;
        } while (i <= numero);
    }
}
    
    

