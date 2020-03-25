package command;

import java.util.ArrayList;
import java.util.List;

public class WorkQueue {
	
	private List<ICommand> commands = new ArrayList<>();
	
	public void addCommand(ICommand c) {
		this.commands.add(c);
	}
	
	public void executeQueue() {
		for (ICommand c : commands) {
			c.execute();//performs a different implementation according to the instance used.
		}
	}

}
