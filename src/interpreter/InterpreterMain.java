package interpreter;

public class InterpreterMain {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Interpreter");
		
		
		Expression exLeft1 = new Subtraction(new Number(2.5), new Number(10));// -7.5
		Expression exRight1 = new Sum(new Number(5), new Number(10));//15
		
		Expression sum1 = new Sum(exLeft1, exRight1);// (-7.5) + 15
		
		System.out.println("Result Expression 1: " + sum1.toEvaluate());//7.5 ->> (2.5 - 10) + (5 + 10)
		
		
		System.out.println("-------------------------");
		
		
		Expression exLeft2 = new Multiplication(new Number(3), new Number(3));//9
		Expression exRight2 = new Sum(new Number(0.5), new Number(0.5));//1
		
		Expression sum2 = new Sum(exLeft2, exRight2);// 9 + 1
		
		System.out.println("Result Expression 1: " + sum2.toEvaluate());//10 ->> (3 * 9) + (0.5 + 0.5)
		
		
		System.out.println("--------------------------------------------- End Test Interpreter");
	}

}
