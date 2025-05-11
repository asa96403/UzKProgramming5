package hw1;

public class ShippingInfo {
	private String city;
	private int zip;
	private String country;
	
	//CONSTRUCTOR
	public ShippingInfo(String city, int zip, String country) {
		super();
		this.city = city;
		this.zip = zip;
		this.country = country;
	}
	
	//GETTERS AND SETTERS
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
