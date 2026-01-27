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

        int D = (A * A) + (B * B) + (C * C);

        System.out.println("Resultado: " + D);
    }
}
