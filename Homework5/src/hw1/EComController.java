package hw1;

public class EComController {
	
	public static void main( String [] args) {
		ShippingInfo info =
		new ShippingInfo (" Munich", 80331 , " Germany ");
		Profile profile = new Profile (info );
		Customer customer = new Customer (profile , 123);
		System .out. println (" Shipping to: " +
		customer . getProfile (). getShipping (). getCity ());
		}
}
