import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        VolumeService service = new VolumeService();

        System.out.print("Digite o valor do raio: ");
        double radius = sc.nextDouble();

        VolumeResult result = service.calculate(radius);

        System.out.println("Valor do volume: " + result.getVolume());

        sc.close();
    }
}
