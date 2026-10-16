import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radio del circulo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Area del circulo: " + area);

        sc.close();
    }
}