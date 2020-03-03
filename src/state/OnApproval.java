package state;

public class OnApproval implements StateOfBudget {

	@Override
	public void applyExtraDiscount(Budget budget) {
		budget.value -= budget.value * 0.05;
	}

	@Override
	public void toApprove(Budget budget) {
		budget.currentState = new Approved();
	}

	@Override
	public void toDisapprove(Budget budget) {
		budget.currentState = new Disapproved();
	}

	@Override
	public void toFinish(Budget budget) {
		throw new RuntimeException("Approving budgets, so they can't go straight to finalized.");
	}

}
