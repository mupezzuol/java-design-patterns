package bridgesAndAdapters.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Adapter");
		
		
		IClock clock = new ClockOfSystem();//it hides the complexity of dealing with a legacy API.
		System.out.println("Date Today: " + clock.today());
		
		
		System.out.println("--------------------------------------------- End Test Adapter");
	}

}
