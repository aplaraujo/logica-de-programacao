import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersonService service = new PersonService();

        String nome, genero;
        System.out.print("Digite o nome da pessoa: ");
        nome = sc.nextLine();
        System.out.print("Digite o gênero da pessoa: ");
        genero = sc.nextLine();

        PersonResult result = service.displayPerson(nome, genero);

        System.out.println(result.getName() + " - " + result.getGender());

        sc.close();
    }
}
