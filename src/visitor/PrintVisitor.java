package visitor;

public class PrintVisitor implements IPrintVisitor {
	
	//Number
	@Override
	public void visitorNumber(Number num) {
		System.out.print(num.getNum());
	}
	
	@Override
	public void visitorSum(Sum sum) {
		System.out.print("(");
		
		sum.getExLeft().accept(this);//Number
		
		System.out.print("+");
		
		sum.getExRight().accept(this);//Number
		
		System.out.print(")");
	}
	
	@Override
	public void visitorSubtraction(Subtraction sub) {
		System.out.print("(");
		
		sub.getExLeft().accept(this);//Number
		
		System.out.print("-");
		
		sub.getExRight().accept(this);//Number
		
		System.out.print(")");
	}

}
