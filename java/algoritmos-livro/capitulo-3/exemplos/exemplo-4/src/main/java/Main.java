import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, genero;
        System.out.print("Digite o nome da pessoa: ");
        nome = sc.nextLine();
        System.out.print("Digite o gênero da pessoa: ");
        genero = sc.nextLine();

        System.out.println(nome + " - " + genero);

        sc.close();
    }
}
