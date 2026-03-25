import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collator brCollator = Collator.getInstance(Locale.of("pt", "BR"));

        int i, j;
        String[] nome = new String[5];
        String aux;

        for (i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nome[i] = sc.nextLine();
        }

        for (i = 0; i < 4; i++) {
            for(j = i + 1; j < 5; j++) {
                if (brCollator.compare(nome[i], nome[j]) > 0) {
                    aux = nome[i];
                    nome[i] = nome[j];
                    nome[j] = aux;
                }
            }
        }

        System.out.println("=====================");
        System.out.println("Vetor ordenado");
        System.out.println("=====================");
        System.out.println();

        for(i = 0; i < 5; i++) {
            System.out.println(nome[i]);
        }

        sc.close();
    }
}
