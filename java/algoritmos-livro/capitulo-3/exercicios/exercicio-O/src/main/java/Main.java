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

        int P = A * C;
        int S = B + D;

        System.out.println("Resultado da soma: " + S);
        System.out.println("Resultado da multiplicação: " + P);

        sc.close();
    }
}