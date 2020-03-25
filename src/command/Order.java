package command;

import java.time.LocalDate;

public class Order {
	
	private String clientName;
	private double value;
	private Status status;
	private LocalDate endDate;
	
	public Order(String clientName, double value) {
		super();
		this.clientName = clientName;
		this.value = value;
		this.status = Status.NEW;
	}
	
	public void pay() {
		this.status = Status.PAID_OUT;
	}
	
	public void finalize() {
		this.status = Status.DELIVERED;
		this.endDate = LocalDate.now();
	}
	
	public String getClientName() {
		return this.clientName;
	}

}
