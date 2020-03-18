package observer;

public class InvoiceDao implements ActionAfterGeneratingNote {

	@Override
	public void execute(Invoice invoice) {
		System.out.println("Save invoice...");
		
	}

}
