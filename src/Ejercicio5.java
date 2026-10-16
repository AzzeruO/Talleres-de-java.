import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1: ");
        double a = sc.nextDouble();

        System.out.print("Lado 2: ");
        double b = sc.nextDouble();

        System.out.print("Lado 3: ");
        double c = sc.nextDouble();

        double perimetro = a + b + c;
        System.out.println("Perimetro del triangulo: " + perimetro);

        sc.close();
    }
}