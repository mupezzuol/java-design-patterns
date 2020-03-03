package decorator;

public class ComplexTaxMain {
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test for Complex Tax");
		
		
		Budget budget = new Budget(500);
		
		
		// Tax in % = 0.2 + 0.1 + 0.06 (INSS + ICMS + ABCD)
		// Calculate: 500 * 0.36 = 180%
		Tax taxValue = new TaxINSS(new TaxICMS(new TaxABCD()));
		System.out.println("Compound Tax Value: " + taxValue.calculate(budget) + "%");//180.0%
		
		
		System.out.println("--------------------------------------------- End Test for Complex Tax");
	}

}
