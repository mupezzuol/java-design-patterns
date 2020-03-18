package observer;

public class SmsSender implements ActionAfterGeneratingNote {

	@Override
	public void execute(Invoice invoice) {
		System.out.println("Send SMS...");
		
	}

}
