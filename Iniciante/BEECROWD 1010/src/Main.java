import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int codigo1 = scanner.nextInt();
        int qtdPecas1 = scanner.nextInt();
        double valorPecas1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int qtdPecas2 = scanner.nextInt();
        double valorPecas2 = scanner.nextDouble();

        double valor = (qtdPecas1 * valorPecas1) + (qtdPecas2 * valorPecas2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valor));

        scanner.close();
    }
}
