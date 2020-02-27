package chainOfResponsibility;

public class Item {
	
	private final String name;
	private final double value;
	
	public Item(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}
	
}
