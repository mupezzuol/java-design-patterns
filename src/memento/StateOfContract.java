package memento;

import java.time.LocalDate;

public class StateOfContract {
	
	private Contract contract;
	private LocalDate dateStateSave;

	public StateOfContract(Contract contract, LocalDate dateStateSave) {
		this.contract = contract;
		this.dateStateSave = dateStateSave;
	}
	
	public Contract getState() {
		return this.contract;
	}
	
	public LocalDate getDateOfState() {
		return this.dateStateSave;
	}

}
