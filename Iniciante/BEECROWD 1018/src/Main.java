import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        int cem = valor / 100;
        int resto = valor % 100;

        int cinquenta = resto / 50;
        resto = resto % 50;

        int vinte = resto / 20;
        resto = resto % 20;

        int dez = resto / 10;
        resto = resto % 10;

        int cinco = resto / 5;
        resto = resto % 5;

        int dois = resto / 2;
        int um = resto % 2;
        resto = 0;

        System.out.println(valor);
        System.out.println(String.format("%.0f nota(s) de R$ 100,00", (double) cem));
        System.out.println(String.format("%.0f nota(s) de R$ 50,00", (double) cinquenta));
        System.out.println(String.format("%.0f nota(s) de R$ 20,00", (double) vinte));
        System.out.println(String.format("%.0f nota(s) de R$ 10,00", (double) dez));
        System.out.println(String.format("%.0f nota(s) de R$ 5,00", (double) cinco));
        System.out.println(String.format("%.0f nota(s) de R$ 2,00", (double) dois));
        System.out.println(String.format("%.0f nota(s) de R$ 1,00", (double) um));

        scanner.close();

    }
}
