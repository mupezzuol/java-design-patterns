package strategy;

public class StrategyMain {
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Strategy");
		
		Budget budget = new Budget(100);
		
		Tax icms = new TaxICMS();
		Tax inss = new TaxINSS();
		
		TaxCalculator taxCalculator = new TaxCalculator();
		
		// Here we passes a Strategy for Calculator Tax, and in execution time, we will know what will be executed ICMS or INSS
		taxCalculator.calculate(budget, icms);//10
		taxCalculator.calculate(budget, inss);//20
		
		// I can create any Tax and not broken my code, because I using pattern Strategy, using much Interfaces
		
		System.out.println("--------------------------------------------- End Test Strategy");
	}

}
