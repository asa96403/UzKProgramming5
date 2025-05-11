package hw2;

public class Profile {
	private ShippingInfo shipping;

	//CONSTRUCTOR
	public Profile(ShippingInfo shipping) throws MissingShippingInfoException {
		super();
		setShipping(shipping);
	}
	
	//GETTERS AND SETTERS
	public ShippingInfo getShipping() {
		return shipping;
	}

	public void setShipping(ShippingInfo shipping) throws MissingShippingInfoException {
		if(shipping == null) {
			throw new MissingShippingInfoException("You need to add shipping information to the Profile!");
		} else {
			this.shipping = shipping;			
		}
	}
	
}
