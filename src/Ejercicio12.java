import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero entero: ");
        int numero = sc.nextInt();

        int ultimaCifra = Math.abs(numero) % 10;
        System.out.println("Ultima cifra: " + ultimaCifra);

        sc.close();
    }
}