package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
	
	private String companyName;
	private String cnpj;
	private LocalDate dateOfIssue;
	private double grossAmountl;
	private double taxes;
	private List<NoteItem> allItems = new ArrayList<>();
	private String notes;
	
	
	public Invoice(String companyName, String cnpj, LocalDate dateOfIssue, double grossAmountl, double taxes,
			List<NoteItem> allItems, String notes) {
		super();
		this.companyName = companyName;
		this.cnpj = cnpj;
		this.dateOfIssue = dateOfIssue;
		this.grossAmountl = grossAmountl;
		this.taxes = taxes;
		this.allItems = allItems;
		this.notes = notes;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public LocalDate getDateOfIssue() {
		return dateOfIssue;
	}


	public void setDateOfIssue(LocalDate dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}


	public double getGrossAmountl() {
		return grossAmountl;
	}


	public void setGrossAmountl(double grossAmountl) {
		this.grossAmountl = grossAmountl;
	}


	public double getTaxes() {
		return taxes;
	}


	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}


	public List<NoteItem> getAllItems() {
		return allItems;
	}


	public void setAllItems(List<NoteItem> allItems) {
		this.allItems = allItems;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}
	

}
