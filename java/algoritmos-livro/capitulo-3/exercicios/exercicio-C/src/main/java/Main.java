import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, altura, volume;
        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        altura = sc.nextDouble();

        volume = 3.14159 * (Math.pow(raio, 2) * altura);

        System.out.printf("Valor do volume: %.1f", volume);
    }
}
