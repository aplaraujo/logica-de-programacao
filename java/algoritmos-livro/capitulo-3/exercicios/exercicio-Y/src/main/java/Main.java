import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PredecessorSuccessorService service = new PredecessorSuccessorService();

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();

        PredecessorSuccessorResult result = service.calculate(A);

        System.out.println("Antecessor de " + A + ": " + result.getPredecessor());
        System.out.println("Sucessor de " + A + ": " + result.getSuccessor());

        sc.close();
    }
}
