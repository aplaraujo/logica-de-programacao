import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        int soma1, soma2, soma3, soma4, soma5, soma6;
        int mult1, mult2, mult3, mult4, mult5, mult6;

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        D = sc.nextInt();

        soma1 = A + B;
        soma2 = A + C;
        soma3 = A + D;
        soma4 = B + C;
        soma5 = B + D;
        soma6 = C + D;

        mult1 = A * B;
        mult2 = A * C;
        mult3 = A * D;
        mult4 = B * C;
        mult5 = B * D;
        mult6 = C * D;

        System.out.println("Resultados das somas: " + soma1 + " - " + soma2 + " - " + soma3 + " - " + soma4 + " - " + soma5 + " - " + soma6);
        System.out.println("Resultados das multiplicações: " + mult1 + " - " + mult2 + " - " + mult3 + " - " + mult4 + " - " + mult5 + " - " + mult6);

        sc.close();
    }
}
