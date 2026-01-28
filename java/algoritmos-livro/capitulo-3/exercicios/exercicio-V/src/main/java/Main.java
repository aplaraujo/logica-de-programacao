import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PowerService service = new PowerService();

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        PowerResult result = service.calculate(A, B);

        System.out.println("Potência: " + result.getPower());

        sc.close();
    }
}
