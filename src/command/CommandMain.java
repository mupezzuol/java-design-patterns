package command;

public class CommandMain {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Command");

		
		// List Orders
		Order order1 = new Order("Murillo", 200.12);
		Order order2 = new Order("Gabriella", 530.33);
		
		// Lista of Command for Execute
		WorkQueue workQueue = new WorkQueue();
		workQueue.addCommand(new PayOrder(order1));
		workQueue.addCommand(new PayOrder(order2));
		workQueue.addCommand(new CompletedOrder(order1));
		
		// Execute Command in List
		workQueue.executeQueue();
		
		
		System.out.println("--------------------------------------------- End Test Command");
	}

}
