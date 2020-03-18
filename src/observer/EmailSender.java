package observer;

public class EmailSender implements ActionAfterGeneratingNote {

	@Override
	public void execute(Invoice invoice) {
		System.out.println("Send e-mail...");
	}

}
