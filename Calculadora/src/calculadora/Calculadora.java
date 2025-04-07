/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int opcion;
        double a, b, resultado;
        String seguir = "s";

        while (seguir.equals("s")) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Elige una opcion (1-4): ");
            opcion = teclado.nextInt();

            System.out.print("Primer numero: ");
            a = teclado.nextDouble();
            System.out.print("Segundo numero: ");
            b = teclado.nextDouble();

            if (opcion == 1) {
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
            } else if (opcion == 2) {
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
            } else if (opcion == 3) {
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
            } else if (opcion == 4) {
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
            } else {
                System.out.println("Opcion no valida.");
            }

            System.out.print("¿Deseas hacer otra operacion? (s para si): ");
            seguir = teclado.next();
        }
    }
}
    
    

