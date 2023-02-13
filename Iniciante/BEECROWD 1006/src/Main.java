import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double media = (a * 2 + b * 3 + c * 5)/10;

        System.out.println(String.format("MEDIA = %.1f", media));

        scanner.close();
    }
}
