import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        double qtdLitros = (tempo * velocidadeMedia) / 12.0;

        System.out.println(String.format("%.3f", qtdLitros));

        scanner.close();
    }
}
