import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double volume = ((4.0/3) * 3.14159 * (raio * raio * raio));

        System.out.println(String.format("VOLUME = %.3f", volume));

        scanner.close();
    }
}
