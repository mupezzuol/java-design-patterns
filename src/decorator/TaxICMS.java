package decorator;

public class TaxICMS extends Tax {
	
	public TaxICMS (Tax otherTax) {
		super(otherTax);
	}
	
	public TaxICMS () {
	}

	@Override
	public double calculate(Budget budget) {
		return (budget.getValue() * 0.1) + (calculateOtherTax(budget));
	}

}
