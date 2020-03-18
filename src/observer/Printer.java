package observer;

public class Printer implements ActionAfterGeneratingNote {

	@Override
	public void execute(Invoice invoice) {
		System.out.println("Printer...");
	}

}
