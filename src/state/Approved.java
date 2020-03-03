package state;

public class Approved implements StateOfBudget {

	@Override
	public void applyExtraDiscount(Budget budget) {
		budget.value -= budget.value * 0.02;
	}

	@Override
	public void toApprove(Budget budget) {
		throw new RuntimeException("Budget is already approved.");
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
