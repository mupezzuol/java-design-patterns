package memento;

import java.util.ArrayList;
import java.util.List;

public class HistoricOfContract {
	
	private List<StateOfContract> stateSaves = new ArrayList<>();
	
	public void addState(StateOfContract state) {
		stateSaves.add(state);
	}
	
	public StateOfContract getState(int index) {
		try {
			if(!stateSaves.get(index).equals(null)) return stateSaves.get(index);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Status not found for index: " + index);
		}
		return null;
	}

}
