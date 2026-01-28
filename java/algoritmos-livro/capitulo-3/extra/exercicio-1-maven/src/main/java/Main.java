import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RectangleAreaService service = new RectangleAreaService();

        System.out.print("Digite a largura do terreno: ");
        double width = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double height = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        double meter = sc.nextDouble();

        RectangleAreaResult result = service.calculate(width, height, meter);

        System.out.println("Área do terreno: " + result.getArea());
        System.out.println("Preço do terreno: " + result.getPrice());

        sc.close();
    }
}
