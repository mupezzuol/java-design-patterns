package state;

public class StateMain {
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test State");
		
		
		Budget budgetExtra = new Budget(500);
		
		// Current State = OnApproval = 0.05
		budgetExtra.applyExtraDiscount();
		System.out.println("Aplly Extra Discount: " + budgetExtra.getValue()); // 500 -= 500 * 0.05 ->>> 475.0
		
		
		// Current State HERE = Approve = 0.02
		budgetExtra.toApprove();
		budgetExtra.applyExtraDiscount();
		System.out.println("Aplly Extra Discount with 'approve': " + budgetExtra.getValue()); // 475.0 -= 475.0 * 0.02 ->>> 465.0
		
		
		// the code below will generate an error, as we cannot apply a discount for this state ''
		budgetExtra.toFinish(); //OK - PROCESS FINISH
		//budgetExtra.applyExtraDiscount(); //Error
		
		
		System.out.println("--------------------------------------------- End Test State");
	}

}
