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
class customer{
	private String customerName;
	private Address residentialAddress;
	customer(String customerName,Address residentialAddress ){
		
		this.customerName=customerName;
		this.residentialAddress=residentialAddress;
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	void getCustomerDetails() {
		System.out.println("Customer:"+this.customerName);
		System.out.println("Residential Address:"+this.residentialAddress);
		
	}
	
}


public class encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubAddress add=new Address("1st Main HSR Layout","Bangalore");
		Address add=new Address("1st Main HSR Layout","Bangalore");
		
		customer c=new customer("John",add);
		c.getCustomerDetails();
	}

}
