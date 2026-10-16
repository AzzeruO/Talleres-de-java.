import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base del triangulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura del triangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura / 2;
        System.out.println("Area del triangulo: " + area);

        sc.close();
    }
}