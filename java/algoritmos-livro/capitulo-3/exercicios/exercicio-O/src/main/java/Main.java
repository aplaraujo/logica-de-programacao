import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int C = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        int D = sc.nextInt();

        CalculationService service = new CalculationService();

        CalculationResult result = service.calculate(A, B, C, D);

        System.out.println("Resultado da soma: " + result.getProduct());
        System.out.println("Resultado da multiplicação: " + result.getSum());

        sc.close();
    }
}