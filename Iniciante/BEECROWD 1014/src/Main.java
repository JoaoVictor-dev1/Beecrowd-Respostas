import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double y = scanner.nextDouble();

        double consumoMedio = (x/y);

        System.out.printf("%.3f km/l\n", consumoMedio);

        scanner.close();
    }
}
