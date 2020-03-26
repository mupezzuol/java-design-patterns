package facadesAndSingletons;

import facadesAndSingletons.models.Client;
import facadesAndSingletons.models.ClientDao;
import facadesAndSingletons.models.Collection;
import facadesAndSingletons.models.Invoice;

//Code not be correct in classes, because this is a example
public class CompanyFacede {

	protected CompanyFacede() {
	
	}
	
	public Client findClient(String cpf) {
		return new ClientDao().findByCpf(cpf);
	}

	public Invoice createInvoice(Client Client, double valor) {
		return new Invoice(Client, valor);
	}

	public Collection generateCollection(Invoice Invoice) {
		Collection cobranca = new Collection("Boleto", Invoice);
		cobranca.issueBill();
		return cobranca;
	}


}
