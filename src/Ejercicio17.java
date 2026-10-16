import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado a: ");
        double a = sc.nextDouble();

        System.out.print("Lado b: ");
        double b = sc.nextDouble();

        double perimetro = 2 * a + 2 * b;
        double area = a * b;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);

        sc.close();
    }
}