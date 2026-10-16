import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Precio de tarifa: ");
        double precioTarifa = sc.nextDouble();

        System.out.print("Precio pagado: ");
        double precioPagado = sc.nextDouble();

        double descuento = ((precioTarifa - precioPagado) / precioTarifa) * 100;
        System.out.println("Porcentaje descontado: " + descuento + "%");

        sc.close();
    }
}
