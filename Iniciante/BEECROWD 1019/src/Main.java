import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();

        int horas = (tempo / 3600);
        int minutos = (tempo % 3600) / 60;
        int segundos = (tempo % 3600) % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

        scanner.close();
    }
}
