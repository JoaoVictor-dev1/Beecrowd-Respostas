import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double area = 3.14159 * (raio * raio);

        System.out.println(String.format("A=%.4f", area));

        scanner.close();
    }
}
