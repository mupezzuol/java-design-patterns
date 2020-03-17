package builder;

public class BuilderMain {
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Builder");
		
		
		// BUILDER -> Call in cascade because
		BuilderInvoice builderInvoice = new BuilderInvoice();
		builderInvoice.toCompany("Murillo Pezzuol LTDA")
			.withCnpj("123456789")
			.withItem(new NoteItem("Notebook", 200))
			.withItem(new NoteItem("Mouse", 300))
			.withItem(new NoteItem("Keyboard", 400))
			.withNotes("Anottation....")
			.onCurrentDate();
		// continue if you want.....
		
		Invoice invoice = builderInvoice.builder();//Return Object Invoice
		
		System.out.println("Company Name: " + invoice.getCompanyName());// Murillo Pezzuol LTDA
		System.out.println("Gross Amountl: " + invoice.getGrossAmountl()); // 900
		System.out.println("Taxes: " + invoice.getTaxes()); // 20
		
		
		System.out.println("--------------------------------------------- End Test Builder");
	}

}
