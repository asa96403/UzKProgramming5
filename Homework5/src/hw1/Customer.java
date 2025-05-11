package hw1;

public class Customer {
	private Profile profile;
	private int id;
	
	//CONSTRUCTOR
	public Customer(Profile profile, int id) {
		super();
		this.profile = profile;
		this.id = id;
	}

	//GETTERS AND SETTERS
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
