package facadesAndSingletons.models;

public class Invoice {

	private Client client;
	private double valor;

	public Invoice(Client client, double valor) {
		this.client = client;
		this.valor = valor;
	}

}
