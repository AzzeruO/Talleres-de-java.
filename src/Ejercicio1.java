import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de la hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Numero de horas trabajadas: ");
        double horas = sc.nextDouble();

        double salarioTotal = valorHora * horas;
        double retencion = salarioTotal * 0.05;
        double salarioNeto = salarioTotal - retencion;

        System.out.printf("Salario total: %.2f%n", salarioTotal);
        System.out.printf("Retencion en la fuente (5%%): %.2f%n", retencion);
        System.out.printf("Salario neto: %.2f%n", salarioNeto);

        sc.close();
    }
}