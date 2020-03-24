package visitor;

public class VisitorMain {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Visitor");
		
		
		Expression exLeft = new Subtraction(new Number(2.5), new Number(10));// -7.5
		Expression exRight = new Sum(new Number(5), new Number(10));//15
		Expression sum = new Sum(exLeft, exRight);
		System.out.println("Result Expression : " + sum.toEvaluate());

		
		// Printer Visitor -> Go through the nodes and do something 
		IPrintVisitor printVisitor = new PrintVisitor();
		System.out.print("Print Visitor: ");
		sum.accept(printVisitor);
	
		
		System.out.println();
		System.out.println("--------------------------------------------- End Test Visitor");
	}

}
