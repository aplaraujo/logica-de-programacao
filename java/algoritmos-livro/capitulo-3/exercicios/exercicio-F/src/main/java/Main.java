import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, AUX;
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();

        AUX = A;
        A = B;
        B = AUX;

        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);

        sc.close();
    }
}
