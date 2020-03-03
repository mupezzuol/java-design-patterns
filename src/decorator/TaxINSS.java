package decorator;

public class TaxINSS extends Tax {
	
	public TaxINSS(Tax otherTax) {
		super(otherTax);
	}
	
	public TaxINSS() {
		super();
	}

	@Override
	public double calculate(Budget budget) {
		return (budget.getValue() * 0.2) + (calculateOtherTax(budget));
	}

}
