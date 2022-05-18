import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Income[] incomes = new Income[] {
				new Income(3000),
				new Salary(7500),
				new StateCouncilSpecialAllowance(15000)
		};
		System.out.println(totalTax(incomes));
	}
	
	public static double totalTax(Income... incomes) {
		double total = 0;
		for (Income income: incomes) {
			total += income.getTax();
		}
		return total;
	}
}
