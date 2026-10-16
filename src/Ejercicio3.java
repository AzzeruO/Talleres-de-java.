import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota primer corte (20%): ");
        double n1 = sc.nextDouble();

        System.out.print("Nota segundo corte (20%): ");
        double n2 = sc.nextDouble();

        double acumulado = 0.2 * n1 + 0.2 * n2;
        double requerida = (3.0 - acumulado) / 0.6;

        if (requerida > 5.0) {
            System.out.println("Es imposible superar la asignatura con esos cortes.");
        } else if (requerida <= 0) {
            System.out.println("Ya tiene asegurada la nota. Minimo en el 60%: 0.0");
        } else {
            System.out.println("Nota minima en el tercer corte (60%): " + requerida);
        }

        sc.close();
    }
}