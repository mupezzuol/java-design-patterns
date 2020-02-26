package strategy;

public class TaxINSS implements Tax {

	@Override
	public double calculate(Budget budget) {
		return budget.getValue() * 0.2;
	}

}
