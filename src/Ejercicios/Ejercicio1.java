package Ejercicios;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = Lectura.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
        Lectura.close();
    }
}
