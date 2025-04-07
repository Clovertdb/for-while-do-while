/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteosnumeros;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class ConteosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuantos numeros deseas ingresar? ");
        double cantidadDouble = teclado.nextDouble(); 

        int cantidad = (int) cantidadDouble;

        double mayores = 0;
        double menores = 0;
        double iguales = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el numero " + i + ": ");
            double numero = teclado.nextDouble();

            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
        }

        System.out.println("Resultado del conteo:");
        System.out.println("numeros mayores que 0: " + (int)mayores);
        System.out.println("numeros menores que 0: " + (int)menores);
        System.out.println("numeros iguales a 0: " + (int)iguales);

        teclado.close();
    }
}
    
    

