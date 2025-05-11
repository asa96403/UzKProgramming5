package hw3;

public class Calculator1 {
	/**
	 * changed type of a and b to int as it just returns Infinity for doubles when
	 * dividing by 0
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double divide(int a, int b) throws ArithmeticException {
		return a / b;
	}

	// ...
	public static void main(String[] args) {
		try {
			System.out.println(Calculator1.divide(3, 0));
		} catch (ArithmeticException e) {
			System.err.println("Error: You cannot divide by 0!");
		}
	}
}
