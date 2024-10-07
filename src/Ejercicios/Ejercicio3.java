
package Ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = Lectura.nextInt();
        int numeroInvertido = 0;
      
        for (; numero != 0; numero /= 10) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
        }
        
        System.out.println("Número invertido: " + numeroInvertido);
        Lectura.close();
    }
}
