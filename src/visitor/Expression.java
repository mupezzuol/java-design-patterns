package visitor;

public interface Expression {

	double toEvaluate();

	void accept(IPrintVisitor printVisitor);

}
