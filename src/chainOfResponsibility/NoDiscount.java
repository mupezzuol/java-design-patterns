package chainOfResponsibility;

public class NoDiscount implements Discount {

	@Override
	public double discount(Budget budget) {
		return 0;
	}

	@Override
	public void setNextDiscount(Discount nextDiscount) {
		//there is no next
	}

}
