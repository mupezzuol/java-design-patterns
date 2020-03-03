package decorator;

public abstract class Tax {

	protected Tax otherTax;

	// Constructor for otherTax for compound tax
	public Tax(Tax otherTax) {
		this.otherTax = otherTax;
	}

	public Tax() {

	}

	public abstract double calculate(Budget budget);

	protected double calculateOtherTax(Budget budget) {
		// Tax that is not compounded must return the value 0
		if (this.otherTax == null)
			return 0.0d;
		else
			return otherTax.calculate(budget); //Calculate other tax, always compound tax.
	}

}
