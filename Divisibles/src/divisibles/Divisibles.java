/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisibles;

/**
 *
 * @author mvmin
 */
public class Divisibles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Numeros del 1 al 100 divisibles por 3 y 5:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
    
    

