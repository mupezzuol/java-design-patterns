package chainOfResponsibility;

public interface Discount {

	double discount(Budget budget);
	
	void setNextDiscount(Discount nextDiscount);
	
}
