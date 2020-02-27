package templateMethod;

import templateMethod.Item;

public class TemplateMethodMain {
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Template Method");
		
		
		Budget budget = new Budget(501);
		budget.addItem(new Item("Mouse", 90.0));
		budget.addItem(new Item("Keyboard", 231.1));
		budget.addItem(new Item("TV", 600.0));
		
		ConditionalTaxTemplate conditionalTaxTemplateABCD = new TaxABCD(); //75.14999999999999
		ConditionalTaxTemplate conditionalTaxTemplateEFGH = new TaxEFGH(); //50.1
		
		// according to its implementation it will call the corresponding calculation, using TEMPLATE METHOD
		System.out.println("Calculate: " + conditionalTaxTemplateABCD.calculate(budget) + "%");
		System.out.println("Calculate: " + conditionalTaxTemplateEFGH.calculate(budget) + "%");

		
		System.out.println("--------------------------------------------- End Test Template Method");
	}

}
