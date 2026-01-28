import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SpeedService service = new SpeedService();

        System.out.print("Digite o valor da distância: ");
        double distance = sc.nextDouble();
        System.out.print("Digite o valor do tempo: ");
        double time = sc.nextDouble();

        SpeedResult result = service.calculate(distance, time);

        System.out.println("Velocidade: " + result.getSpeed());

        sc.close();
    }
}
