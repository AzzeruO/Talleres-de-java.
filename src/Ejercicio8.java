import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Millas marinas: ");
        double millas = sc.nextDouble();

        double metros = millas * 1852;
        System.out.println(millas + " millas marinas = " + metros + " metros");

        sc.close();
    }
}