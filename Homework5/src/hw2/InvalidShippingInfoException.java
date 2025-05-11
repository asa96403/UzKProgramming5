package hw2;

public class InvalidShippingInfoException extends Exception{

	/**
	 * serial version id added due to remark by IDE
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidShippingInfoException(String message) {
		super(message);
	}
}
