package decorator;

public class TaxEFGH extends ConditionalTaxTemplate {
	
	@Override
	protected boolean mustUseMaxTaxAplly(Budget budget) {
		return budget.getValue() > 500;
	}

	@Override
	protected double maxTaxAplly(Budget budget) {
		return budget.getValue() * 0.10;
	}

	@Override
	protected double minTaxAplly(Budget budget) {
		return budget.getValue() * 0.06;
	}

}
