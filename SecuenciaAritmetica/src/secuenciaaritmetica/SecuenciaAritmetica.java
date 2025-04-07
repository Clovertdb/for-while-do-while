/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciaaritmetica;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class SecuenciaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        int inicio, diferencia, maximo;

        System.out.print("Ingresa el primer numero de la secuencia: ");
        inicio = teclado.nextInt();

        System.out.print("Ingresa la diferencia entre los numeros: ");
        diferencia = teclado.nextInt();

        System.out.print("Ingresa el numero maximo hasta el cual generar la secuencia: ");
        maximo = teclado.nextInt();

        System.out.println("Secuencia aritmetica:");

        int actual = inicio;

        do {
            System.out.println(actual);
            actual = actual + diferencia;
        } while (actual <= maximo);
    }
}
    
    

