import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de reais: ");
        double real = sc.nextDouble();
        System.out.print("Digite o valor da cotação: ");
        double cotacao = sc.nextDouble();

        double dolar = real / cotacao;

        System.out.println("Valor em dólares: U$ " + String.format("%.2f", dolar));

        sc.close();
    }
}
