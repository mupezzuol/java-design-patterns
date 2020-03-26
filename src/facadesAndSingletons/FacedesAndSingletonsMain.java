package facadesAndSingletons;

import facadesAndSingletons.models.Client;
import facadesAndSingletons.models.Invoice;

public class FacedesAndSingletonsMain {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Facedes and Singletons");
		
		
		// Singleton
		CompanyFacede facade = new CompanyFacedeSingleton().getInstance();
		
		//Facede
		facade.findClient("123456");
		facade.createInvoice(new Client("MuPezzuol"), 50);
		facade.generateCollection(new Invoice(new Client("MuPezzuol"), 500));
		
		// Facede + Singleton = Together this example
		
		
		System.out.println("--------------------------------------------- End Test Facedes and Singletons");
	}

}
