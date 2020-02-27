package templateMethod;

public abstract class ConditionalTaxTemplate implements Tax{
	
	@Override
	public double calculate(Budget budget) {
		
		if(mustUseMaxTaxAplly(budget)) {
			return maxTaxAplly(budget); // Aplly Max Tax
		} else {
			return minTaxAplly(budget); // Aplly Min Tax
		}
		
	}
	
	// Protected for only children to see
	protected abstract boolean mustUseMaxTaxAplly(Budget budget);
	
	protected abstract double maxTaxAplly(Budget budget);

	protected abstract double minTaxAplly(Budget budget);

}
