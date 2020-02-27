package chainOfResponsibility;

public class DiscountCalculator {
	
	public double calculate(Budget budget) {
		Discount d1 = new DiscountForFiveItems();
		Discount d2 = new DiscountForMoreThanFiveHundredMoneys();
		Discount dEnd = new NoDiscount(); //we need a guy to take care of the discount if he goes through all the discounts, that is, do not apply the discount.
		
		// Add Discounts Available
		d1.setNextDiscount(d2); // If it is not the 'd1' discount, it calls the next discount which will be the 'd2'
		d2.setNextDiscount(dEnd); // If it is not the 'd2' discount, it calls the next discount which will be the 'dEnd', which is the last discount, which actually does not make any discount
		
		return d1.discount(budget); // chained call, so it will return the corresponding discount amount
	}

}
