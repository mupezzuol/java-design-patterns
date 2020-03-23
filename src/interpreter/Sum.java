package interpreter;

public class Sum implements Expression{
	
	private Expression exLeft;
	private Expression exRight;

	public Sum(Expression exLeft, Expression exRight){
		this.exLeft = exLeft;
		this.exRight = exRight;
	}

	@Override
	public double toEvaluate() {
		double valueLeft = this.exLeft.toEvaluate();//evaluate yourself
		double valueRight = this.exRight.toEvaluate();//evaluate yourself
		return valueLeft + valueRight;
	}

}
