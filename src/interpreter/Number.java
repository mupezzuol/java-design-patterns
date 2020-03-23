package interpreter;

public class Number implements Expression{
	
	private double num;

	public Number(double num){
		this.num = num;
	}

	@Override
	public double toEvaluate() {
		return this.num;
	}

}
