import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        OperationService service = new OperationService();

        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();

        OperationResult result = service.calculate(A, B);

        System.out.println("Resultado da soma: " + result.getSum());
        System.out.println("Resultado da subtração: " + result.getSubtract());
        System.out.println("Resultado da multiplicação: " + result.getMultiply());
        System.out.println("Resultado da divisão: " + result.getDivide());

        sc.close();
    }
}
