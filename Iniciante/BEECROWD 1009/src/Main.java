import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double total = (salario + (vendas * 0.15));

        if (vendas != 0) {
            System.out.printf(String.format("TOTAL = R$ %.2f\n", total));
        } 
        else {
            System.out.printf(String.format("TOTAL = R$ %.2f\n", salario));
        }

        scanner.close();
    }
}
