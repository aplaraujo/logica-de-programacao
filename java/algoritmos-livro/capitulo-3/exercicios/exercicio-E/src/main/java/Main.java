import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int taxa, tempo;
        double valor, prestacao;

        System.out.print("Digite o valor do produto: ");
        valor = sc.nextDouble();
        System.out.print("Digite a taxa em atraso: ");
        taxa = sc.nextInt();
        System.out.print("Digite o tempo: ");
        tempo = sc.nextInt();

        prestacao = valor + (valor * (taxa / 100.0) * tempo);

        System.out.println("Valor da prestação: R$ " + String.format("%.2f", prestacao));

        sc.close();
    }
}
