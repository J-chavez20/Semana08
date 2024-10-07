
package Ejercicios;
import java.util.Scanner;
public class Ejercicio2 {
      public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        System.out.print("Introduce un numero limite: ");
        int limite = Lectura.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Serie de Fibonacci: " + a + ", " + b);
        
        for (int i = 2; i < limite; i++) {
            int siguiente = a + b;
            System.out.print(", " + siguiente);
            a = b;
            b = siguiente;
        }
        
        System.out.println();
        Lectura.close();
    }  
}
