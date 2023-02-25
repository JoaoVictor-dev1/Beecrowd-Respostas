import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int dias = scanner.nextInt();

        int ano = (dias / 365);
        dias = (dias % 365);

        int mes = (dias / 30);
        dias = (dias % 30);

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dias);

        scanner.close();
    }
}
