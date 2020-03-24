package bridgesAndAdapters.bridge;

public class BridgeMain {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Bridge");
		
		
		IMap map = new GoogleMap();//Class 'GoogleMap' hides the complexity of getting on google maps
		map.returnMap("Rua Sérgio Ruiz de Albuquerque");

		
		System.out.println("--------------------------------------------- End Test Bridge");
	}

}
