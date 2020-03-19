package memento;

import java.time.LocalDate;

public class MementoMain {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Memento");
		
		
		HistoricOfContract historicOfContract = new HistoricOfContract();
		
		Contract contract = new Contract(LocalDate.now(), "Murillo", ContractType.NEW);
		
		System.out.println("Contract Type Current 1: " + contract.getContractType());
		
		
		// Save State of Contract
		historicOfContract.addState(contract.saveState());
		
		contract.progress();
		historicOfContract.addState(contract.saveState());
		System.out.println("Contract Type Current 2: " + contract.getContractType());
		
		contract.progress();
		historicOfContract.addState(contract.saveState());
		System.out.println("Contract Type Current 3: " + contract.getContractType());
		
		
		System.out.println("------- Finding previous states in history -------");
		
		StateOfContract previousState1 = historicOfContract.getState(1);
		StateOfContract previousState2 = historicOfContract.getState(2);
		
		System.out.println("Previous State index 1: " + previousState1.getState().getContractType() + "Date: " + previousState1.getDateOfState());//IN_PROGRESS
		System.out.println("Previous State index 1: " + previousState2.getState().getContractType() + "Date: " + previousState2.getDateOfState());//AGREED

		
		System.out.println("--------------------------------------------- End Test Memento");
	}
	
	
}
