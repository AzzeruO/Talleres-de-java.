import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero entero 1: ");
        int a = sc.nextInt();

        System.out.print("Numero entero 2: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + ((double) a / b));
            System.out.println("Resto (modulo): " + (a % b));
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        sc.close();
    }
}