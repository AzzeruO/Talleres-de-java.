import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Medida en centimetros: ");
        double cm = sc.nextDouble();

        double pulgadas = cm / 2.54;
        System.out.println(cm + " cm = " + pulgadas + " pulgadas");

        sc.close();
    }
}