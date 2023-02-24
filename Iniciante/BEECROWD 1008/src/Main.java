import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int horas = scanner.nextInt();
        double valor = scanner.nextDouble();
        double salario = (horas * valor);

        System.out.println("NUMBER = " + numero);
        System.out.println(String.format("SALARY = U$ %.2f", salario));

        scanner.close();
    }
}
