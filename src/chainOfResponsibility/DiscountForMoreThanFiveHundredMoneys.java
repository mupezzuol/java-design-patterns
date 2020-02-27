package chainOfResponsibility;

public class DiscountForMoreThanFiveHundredMoneys implements Discount {

	private Discount nextDiscount;

	@Override
	public double discount(Budget budget) {
		if (budget.getValue() > 500) {
			return budget.getValue() * 0.07; // Discount 7%
		} else {
			return nextDiscount.discount(budget); // Else, call next discount
		}
	}

	@Override
	public void setNextDiscount(Discount nextDiscount) {
		this.nextDiscount = nextDiscount;
	}

}
