package state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import templateMethod.Item;

public class Budget {

	protected double value;
	private final List<Item> items;
	
	protected StateOfBudget currentState;

	public Budget(double value) {
		super();
		this.value = value;
		items = new ArrayList<Item>();
		currentState = new OnApproval(); //State Initial
	}

	public double getValue() {
		return value;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}

	public List<Item> getItems() {
		return Collections.unmodifiableList(items);// unmodifiableList -> Return a List immutable.
	}
	
	public void applyExtraDiscount() {
		currentState.applyExtraDiscount(this); // this -> we pass the object itself, because this is where we want to make the changes
	}
	
	public void toApprove() {
		currentState.toApprove(this);
	}
	
	public void toDisapprove() {
		currentState.toDisapprove(this);
	}
	
	public void toFinish() {
		currentState.toFinish(this);
	}

}
