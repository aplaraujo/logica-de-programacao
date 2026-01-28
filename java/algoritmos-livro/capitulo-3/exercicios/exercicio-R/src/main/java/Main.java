import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ElectionService service = new ElectionService();

        System.out.print("Digite a quantidade de votos do candidato A: ");
        int candA = sc.nextInt();
        System.out.print("Digite a quantidade de votos do candidato B: ");
        int candB = sc.nextInt();
        System.out.print("Digite a quantidade de votos do candidato C: ");
        int candC = sc.nextInt();
        System.out.print("Digite a quantidade de votos nulos: ");
        int nullVotes = sc.nextInt();
        System.out.print("Digite a quantidade de votos em branco: ");
        int blankVotes = sc.nextInt();

        ElectionResult result = service.calculate(candA, candB, candC, nullVotes, blankVotes);

        System.out.println("Quantidade total de eleitores: " + result.getTotalQuantity());
        System.out.println("Percentual de votos válidos: " + result.getValidVotesPercentage());
        System.out.println("Percentual de votos do candidato A: " + result.getVotesAPercentage());
        System.out.println("Percentual de votos do candidato B: " + result.getVotesBPercentage());
        System.out.println("Percentual de votos do candidato B: " + result.getVotesCPercentage());
        System.out.println("Percentual de votos nulos: " + result.getNullVotesPercentage());
        System.out.println("Percentual de votos em branco: " + result.getBlankVotesPercentage());

        sc.close();
    }
}
