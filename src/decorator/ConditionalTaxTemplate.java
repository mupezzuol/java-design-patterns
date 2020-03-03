package decorator;

public abstract class ConditionalTaxTemplate extends Tax{
	
	@Override
	public double calculate(Budget budget) {
		
		if(mustUseMaxTaxAplly(budget)) {
			return maxTaxAplly(budget) + calculateOtherTax(budget); // Aplly Max Tax + calculateOtherTax
		} else {
			return minTaxAplly(budget) + calculateOtherTax(budget); // Aplly Min Tax + calculateOtherTax
		}
		
	}
	
	// Protected for only children to see
	protected abstract boolean mustUseMaxTaxAplly(Budget budget);
	
	protected abstract double maxTaxAplly(Budget budget);

	protected abstract double minTaxAplly(Budget budget);

}
