package strategy;

public class TaxICMS implements Tax {

	@Override
	public double calculate(Budget budget) {
		return budget.getValue() * 0.1;
	}

}
