package hw3;

/**
 * handles the ArithmeticException within the divide method
 * @author aabert
 */
public class Calculator2 {
	/**
	 * changed parameter types of a and b to int as it just returns Infinity with doubles
	 * @param a int for a/b
	 * @param b int for a/b
	 * @return the result of the division a/b
	 */
	public static double divide(int a, int b){
		try {
			return a/b;
		} catch (ArithmeticException e) {
			System.err.println("Error: You cannot divide by 0!");
			return Double.NaN;
		}
		
		}
		//...
		public static void main(String [] args){
		System.out.println(Calculator2.divide(3, 0));
		}
}
