import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Precio del articulo: ");
        double precio = sc.nextDouble();

        double iva = precio * 0.19; // IVA Colombia 19%
        System.out.println("Valor del IVA (19%): " + iva);
        System.out.println("Total con IVA: " + (precio + iva));

        sc.close();
    }
} 