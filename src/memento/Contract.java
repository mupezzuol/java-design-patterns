package memento;

import java.time.LocalDate;

public class Contract {
	
	private LocalDate date;
	private String clientName;
	private ContractType contractType;
	
	// Progress States
	public void progress() {
		if (contractType == ContractType.NEW) contractType = ContractType.IN_PROGRESS;
		else if(contractType == ContractType.IN_PROGRESS) contractType = ContractType.AGREED;
		else if(contractType == ContractType.AGREED) contractType = ContractType.CONCLUDED;
	}
	
	//State of Contract -> SAVE
	public StateOfContract saveState() {
		return new StateOfContract(new Contract(this.date, this.clientName, this.contractType), LocalDate.now());
	}
	
	public Contract(LocalDate date, String clientName, ContractType contractType) {
		super();
		this.date = date;
		this.clientName = clientName;
		this.contractType = contractType;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getClientName() {
		return clientName;
	}

	public ContractType getContractType() {
		return contractType;
	}


}
