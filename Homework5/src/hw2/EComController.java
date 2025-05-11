package hw2;

public class EComController {
	
	public static void main( String [] args) {
		ShippingInfo info;
		try {
			info = new ShippingInfo (" Munich", 80331 , " Germany ");
			Profile profile = new Profile (info );
			Customer customer = new Customer (profile , -123);
			System .out. println (" Shipping to: " +
					customer . getProfile (). getShipping (). getCity ());
		} catch (InvalidShippingInfoException e) {
			System.err.println("You entered invalid values for the Shipping info: " + e.getMessage());
			System.err.println("More deatails:");
			e.printStackTrace();
		} catch (MissingShippingInfoException e) {
			System.err.println("You did not pass in any ShippingInfo for Profile!: " + e.getMessage());
			System.err.println("More deatails:");
			e.printStackTrace();
		} catch (InvalidCustomerException e) {
			System.err.println("You entered invalid values for Customer: " + e.getMessage());
			System.err.println("More deatails:");
			e.printStackTrace();
		}
		}
}
