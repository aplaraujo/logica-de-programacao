import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CircleService service = new CircleService();

        System.out.print("Digite o valor do raio: ");
        double radius = sc.nextDouble();

        CircleResult result = service.calculate(radius);

        System.out.println("Valor da área da circunferência: " + String.format("%.2f", result.getArea()));

        sc.close();
    }
}
