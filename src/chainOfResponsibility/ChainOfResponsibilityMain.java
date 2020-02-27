package chainOfResponsibility;

public class ChainOfResponsibilityMain {
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Chain Of Responsibility");
		
		
		DiscountCalculator discountCalculator = new DiscountCalculator();
		
		Budget budget = new Budget(500.1);
		budget.addItem(new Item("Mouse", 250.0));
		budget.addItem(new Item("Keyboard", 320.1));
		
		// The calculation will call the method in order as prescribed, until you find the discount applicable. In this case, discount on the budget with more than 500 cash.
		double discountFinal = discountCalculator.calculate(budget);
		
		System.out.println("Discount Final: " + discountFinal + "%"); //35.007000000000005%
		
		
		System.out.println("--------------------------------------------- End Test Chain Of Responsibility");
	}

}
