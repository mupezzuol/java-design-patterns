package state;

public class Finished implements StateOfBudget {

	@Override
	public void applyExtraDiscount(Budget budget) {
		throw new RuntimeException("Finalized budget do not receive extra discounts.");
	}

	@Override
	public void toApprove(Budget budget) {
		throw new RuntimeException("Budgets already finalized.");
	}

	@Override
	public void toDisapprove(Budget budget) {
		throw new RuntimeException("Budgets already finalized.");
	}

	@Override
	public void toFinish(Budget budget) {
		throw new RuntimeException("Budgets already finalized.");
	}

}
