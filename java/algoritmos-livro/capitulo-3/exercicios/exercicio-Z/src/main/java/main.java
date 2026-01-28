import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SquareDivisionService service = new SquareDivisionService();

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        SquareDivisionResult result = service.calculate(A, B);

        System.out.println("Resultado: " + result.getSquare());

        sc.close();
    }
}
