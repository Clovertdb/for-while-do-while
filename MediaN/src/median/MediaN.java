/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package median;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class MediaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int suma = 0;
        int cantidad = 0;

        System.out.println("Ingresa numeros positivos. Termina con un numero negativo.");

        while (numero >= 0) {
            System.out.print("numero: ");
            numero = teclado.nextInt();

            if (numero >= 0) {
                suma = suma + numero;
                cantidad = cantidad + 1;
            }
        }

        if (cantidad > 0) {
            double media = (double) suma / cantidad;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron numeros positivos.");
        }
    }
}
   
    

