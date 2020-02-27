package templateMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import templateMethod.Item;

public class Budget {

	private double value;
	private final List<Item> items;

	public Budget(double value) {
		super();
		this.value = value;
		items = new ArrayList<Item>();
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

}
