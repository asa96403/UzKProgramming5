package hw2;

public class ShippingInfo {
	private String city;
	private int zip;
	private String country;
	
	//CONSTRUCTOR
	public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
		super();
		setCity(city);
		setZip(zip);
		this.country = country;
	}
	
	//GETTERS AND SETTERS
	public String getCity() {
		return city;
	}

	public void setCity(String city) throws InvalidShippingInfoException {
		if(city==null) {
			throw new InvalidShippingInfoException("The city name cannot be empty!");
		} else {
			this.city = city;
		}
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) throws InvalidShippingInfoException {
		if(zip<0) {
			throw new InvalidShippingInfoException("The zip code must be a positive number!");
		} else {
			this.zip = zip;
		}
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
