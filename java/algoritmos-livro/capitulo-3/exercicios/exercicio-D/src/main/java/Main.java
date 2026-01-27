import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo, velocidade, distancia;
        double litros_usados;

        System.out.print("Digite o tempo gasto na viagem: ");
        tempo = sc.nextInt();
        System.out.print("Digite a velocidade média: ");
        velocidade = sc.nextInt();
        distancia = tempo * velocidade;
        litros_usados = (double) distancia / 12;

        System.out.println("Velocidade média: " + velocidade);
        System.out.println("Tempo gasto na viagem: " + tempo);
        System.out.println("Distância percorrida: " + distancia);
        System.out.println("Quantidade de litros usada na viagem: " + String.format("%.1f", litros_usados));

        sc.close();
    }
}
