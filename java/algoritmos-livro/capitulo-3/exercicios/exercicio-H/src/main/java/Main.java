import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento da caixa retangular: ");
        double comprimento = sc.nextDouble();
        System.out.print("Digite a largura da caixa retangular: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura da caixa retangular: ");
        double altura = sc.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.println("Volume da caixa retangular: " + String.format("%.1f", volume));

        sc.close();
    }
}
