import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.println("Valor de " + A + " ao quadrado: " + (A * A));

        sc.close();
    }
}
