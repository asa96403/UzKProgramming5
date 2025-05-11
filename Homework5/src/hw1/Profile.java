package hw1;

public class Profile {
	private ShippingInfo shipping;

	//CONSTRUCTOR
	public Profile(ShippingInfo shipping) {
		super();
		this.shipping = shipping;
	}
	
	//GETTERS AND SETTERS
	public ShippingInfo getShipping() {
		return shipping;
	}

	public void setShipping(ShippingInfo shipping) {
		this.shipping = shipping;
	}
	
}
