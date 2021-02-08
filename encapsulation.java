package encapsulation;

class Address {
	private String addressLine;
	private String city;

	Address(String address, String city) {
		this.addressLine = address;
		this.city = city;

	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	void getAddressDetails(){
		System.out.println(this.addressLine+","+this.city);
		
	}
	
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add=new Address("1st Main HSR Layout","Bangalore");
		add.getAddressDetails();

	}

}
