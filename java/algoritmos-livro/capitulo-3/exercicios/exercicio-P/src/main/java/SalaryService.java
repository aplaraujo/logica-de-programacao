public class SalaryService {

    public SalaryResult calculate(double monthlySalary, double raisePercentage) {
        double getNewSalary = monthlySalary + (monthlySalary * (raisePercentage/100.0));

        return new SalaryResult(getNewSalary);
    }
}
