package hw2;

public class Customer {
	private Profile profile;
	private int id;

	// CONSTRUCTOR
	public Customer(Profile profile, int id) throws InvalidCustomerException {
		super();
		setProfile(profile);
		setId(id);
	}

	// GETTERS AND SETTERS
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) throws InvalidCustomerException {
		if (profile == null) {
			throw new InvalidCustomerException("Profile cannot be null");
		} else {
			this.profile = profile;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws InvalidCustomerException {
		if(id<0) {
			throw new InvalidCustomerException("ID cannot be negative");
		} else {
			this.id = id;
		}
	}

}
