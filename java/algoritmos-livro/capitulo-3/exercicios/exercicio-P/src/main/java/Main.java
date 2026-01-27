import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SalaryService service = new SalaryService();

        System.out.print("Digite o salário mensal: ");
        double monthlySalary = sc.nextDouble();
        System.out.print("Digite o percentual de reajuste: ");
        double raisePercentage = sc.nextDouble();

        SalaryResult result = service.calculate(monthlySalary, raisePercentage);

        System.out.printf("Novo salário: R$ %.2f", result.getNewSalary());

        sc.close();
    }
}
