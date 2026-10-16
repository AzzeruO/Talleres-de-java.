import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor por unidad: ");
        double valorUnidad = sc.nextDouble();

        System.out.print("Cantidad de articulos: ");
        int cantidad = sc.nextInt();

        double total = valorUnidad * cantidad;
        System.out.println("Total a pagar: " + total);

        sc.close();
    }
}