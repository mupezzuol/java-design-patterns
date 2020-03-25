package command;

public class CompletedOrder implements ICommand {
	
	private Order order;

	public CompletedOrder(Order order) {
		this.order = order;
	}

	@Override
	public void execute() {
		System.out.println("Completing "+ this.order.getClientName()+ "'s order");
		this.order.finalize(); //encapsulates the finalized command to execute at some point.
	}

}
