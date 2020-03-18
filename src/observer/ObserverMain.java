package observer;

public class ObserverMain {
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Observer");
		
		
		BuilderInvoice builderInvoice = new BuilderInvoice();
		
		builderInvoice.toCompany("Murillo Pezzuol LTDA")
			.withCnpj("987654321")
			.withItem(new NoteItem("Notebook", 100))
			.withNotes("Anottation....")
			.onCurrentDate();
		
		// Add to the list the actions that my observer will iterate
		builderInvoice.addAction(new EmailSender());
		builderInvoice.addAction(new InvoiceDao());
		builderInvoice.addAction(new SmsSender());
		builderInvoice.addAction(new Printer());
		
		Invoice invoice = builderInvoice.builder();//Return Object Invoice
		
		
		System.out.println("Gross Amountl: " + invoice.getGrossAmountl()); // 100
		
		// OUT -> All registered actions and that our 'observer' has found and executed must be printed.
		
		
		System.out.println("--------------------------------------------- End Test Observer");
	}

}
