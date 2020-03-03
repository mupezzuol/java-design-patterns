package state;

public class Disapproved implements StateOfBudget {

	@Override			
	public void applyExtraDiscount(Budget budget) {
		throw new RuntimeException("Disapproved budget does not receive extra discounts."); 
	}

	@Override
	public void toApprove(Budget budget) {
		throw new RuntimeException("Disapproved budgets cannot be approved.");
	}

	@Override
	public void toDisapprove(Budget budget) {
		throw new RuntimeException("Budget is already disapprove.");
	}

	@Override
	public void toFinish(Budget budget) {
		budget.currentState = new Finished();
	}

}
