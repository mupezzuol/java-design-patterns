package command;

public class PayOrder implements ICommand {

	private Order order;

	public PayOrder(Order order) {
		this.order = order;
	}

	@Override
	public void execute() {
		System.out.println("Carrying out payment for "+ this.order.getClientName()+ " customer order");
		this.order.pay();//encapsulates the finalized command to execute at some point.
	}

}
