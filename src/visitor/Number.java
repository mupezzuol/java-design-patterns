package visitor;

public class Number implements Expression{
	
	private double num;

	public Number(double num){
		this.num = num;
	}

	@Override
	public double toEvaluate() {
		return this.num;
	}

	public double getNum() {
		return num;
	}

	@Override
	public void accept(IPrintVisitor printVisitor) {
		printVisitor.visitorNumber(this);//visits the object itself. The node knows which method of the printer it needs to invoke.
	}
	
}
