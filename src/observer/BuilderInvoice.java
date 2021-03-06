package observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BuilderInvoice {
	
	private String companyName;
	private String cnpj;
	private List<NoteItem> allItems = new ArrayList<>();
	private double grossAmountl;
	private double taxes;
	private String notes;
	private LocalDate date;
	
	private List<ActionAfterGeneratingNote> allActions;
	
	public BuilderInvoice() {
		this.allActions = new ArrayList<>();
	}
	
	public BuilderInvoice toCompany(String companyName) {
		this.companyName = companyName;
		return this; //Return this use for method in cascade for BUILDER
	}
	
	public BuilderInvoice withCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this; //Return this use for method in cascade for BUILDER
	}
	
	public BuilderInvoice withItem(NoteItem item) {
		this.allItems.add(item);
		this.grossAmountl += item.getValue();
		this.taxes = item.getValue() * 0.05;
		return this; //Return this use for method in cascade for BUILDER
	}
	
	public BuilderInvoice withNotes(String notes) {
		this.notes = notes;
		return this; //Return this use for method in cascade for BUILDER
	}
	
	public BuilderInvoice onCurrentDate() {
		this.date = LocalDate.now();
		return this; //Return this use for method in cascade for BUILDER
	}
	
	public void addAction(ActionAfterGeneratingNote action) {
		this.allActions.add(action);
	}
	
	public Invoice builder() {
		Invoice invoice = new Invoice(companyName, cnpj, date, grossAmountl, taxes, allItems, notes);
		
		// Observer
		for (ActionAfterGeneratingNote actions : allActions) {
			actions.execute(invoice);
		}
		
		return invoice;
	}
	

}
