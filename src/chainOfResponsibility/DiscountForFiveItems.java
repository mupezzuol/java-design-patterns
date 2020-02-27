package chainOfResponsibility;

public class DiscountForFiveItems implements Discount {

	private Discount nextDiscount;

	@Override
	public double discount(Budget budget) {
		if (budget.getItems().size() > 5) {
			return budget.getValue() * 0.01; // Discount 1%
		} else {
			return nextDiscount.discount(budget); // Else, call next discount
		}
	}

	@Override
	public void setNextDiscount(Discount nextDiscount) {
		this.nextDiscount = nextDiscount;
	}

}
