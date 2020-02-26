package strategy;

public class TaxCalculator {

	public void calculate(Budget budget, Tax anyTax) {

		double valueResult = anyTax.calculate(budget);
		System.out.println("Value: " + valueResult + ". Class @Override: " + anyTax.getClass().getSimpleName());
	}

}
