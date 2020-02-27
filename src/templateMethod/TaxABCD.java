package templateMethod;

public class TaxABCD extends ConditionalTaxTemplate {

	// If item in the list is greater than 100 it returns true
	private boolean thereIsAnItemGreaterThan100InTheBudget(Budget budget) {
		return budget.getItems().stream()
			.anyMatch(i -> {
				if (i.getValue() > 100) {
					return true;
				}
				return false;
			});
	}

	@Override
	protected boolean mustUseMaxTaxAplly(Budget budget) {
		return budget.getValue() > 500 && thereIsAnItemGreaterThan100InTheBudget(budget);
	}

	@Override
	protected double maxTaxAplly(Budget budget) {
		return budget.getValue() * 0.15;
	}

	@Override
	protected double minTaxAplly(Budget budget) {
		return budget.getValue() * 0.06;
	}

}
