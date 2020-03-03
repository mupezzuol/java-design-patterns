package state;

public interface StateOfBudget {
	
	void applyExtraDiscount(Budget budget);
	
	// Apply State
	void toApprove(Budget budget);
	void toDisapprove(Budget budget);
	void toFinish(Budget budget);

}
