package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	/*public int divide(int a, int b) {
		int c = 0;
		try {
			c = a / b;
		}catch(ArithmeticException e) {
			System.out.println("can't divide by 0");
		}
		return c;
	} */
	public int divide(int a, int b) {
		return a/b;
	}
}
