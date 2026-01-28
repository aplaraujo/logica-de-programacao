import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        FootToMeterService service = new FootToMeterService();

        System.out.print("Digite o valor de um pé: ");
        double foot = sc.nextDouble();

        FootToMeterResult result = service.calculate(foot);

        System.out.println("Resultado: " + result.getMeter());

        sc.close();
    }
}
