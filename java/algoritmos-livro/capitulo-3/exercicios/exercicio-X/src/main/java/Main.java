import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RootService service = new RootService();

        System.out.print("Digite o valor da base: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor do índice: ");
        double index = sc.nextDouble();

        RootResult result = service.calculate(base, index);

        System.out.println("Resultado: " + result.getRoot());

        sc.close();
    }
}
