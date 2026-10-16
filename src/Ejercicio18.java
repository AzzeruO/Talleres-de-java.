import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado del cuadrado: ");
        double a = sc.nextDouble();

        double perimetro = 4 * a;
        double area = a * a;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);

        sc.close();
    }
}