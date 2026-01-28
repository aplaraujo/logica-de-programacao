import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RectangleService service = new RectangleService();

        System.out.print("Base do retângulo: ");
        double width = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        double height = sc.nextDouble();

        RectangleResult result = service.calculate(width, height);

        System.out.println("AREA = " + result.getArea());
        System.out.println("PERIMETRO = " + result.getPerimeter());
        System.out.println("DIAGONAL = " + result.getDiagonal());

        sc.close();
    }
}
