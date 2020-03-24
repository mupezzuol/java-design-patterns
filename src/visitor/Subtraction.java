package visitor;

public class Subtraction implements Expression {
	
	private Expression exLeft;
	private Expression exRight;

	public Subtraction(Expression exLeft, Expression exRight){
		this.exLeft = exLeft;
		this.exRight = exRight;
	}
	
	@Override
	public double toEvaluate() {
		double valueLeft = this.exLeft.toEvaluate();//evaluate yourself
		double valueRight = this.exRight.toEvaluate();//evaluate yourself
		return valueLeft - valueRight;
	}

	@Override
	public void accept(IPrintVisitor printVisitor) {
		printVisitor.visitorSubtraction(this);//visits the object itself. The node knows which method of the printer it needs to invoke.
	}

	public Expression getExLeft() {
		return exLeft;
	}

	public Expression getExRight() {
		return exRight;
	}

}
