package facadesAndSingletons;

public class CompanyFacedeSingleton {

	private static CompanyFacede instance;

	public CompanyFacede getInstance() {
		if (instance == null) {
			instance = new CompanyFacede();
		}
		return instance;
	}

}
