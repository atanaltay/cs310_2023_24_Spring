package model;

public class Address {
	
	private String city;
	private String postcode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String city, String postcode) {

		this.city = city;
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public String getInfo() {
		return "Address:" + city + " -- " + postcode;
	}
	

}
