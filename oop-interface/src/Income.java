
public abstract class Income implements BaseIncome {
	protected double income;
	
	public Income(double income) {
		this.income = income;
	}
	
	public abstract double getTax();
}