package hw2;

public class MissingShippingInfoException extends Exception{

	/**
	 * serial version id added due to remark by IDE
	 */
	private static final long serialVersionUID = 1L;
	
	public MissingShippingInfoException(String message) {
		super(message);
	}

}
