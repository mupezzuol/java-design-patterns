package visitor;

public interface IPrintVisitor {

	void visitorNumber(Number num);
	void visitorSum(Sum sum);
	void visitorSubtraction(Subtraction sub);

}