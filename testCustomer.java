package encapsulation;
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
public class testCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address add=new Address("1st Main HSR Layout","Bangalore");
		
		customer c=new customer("John",add);
		c.getCustomerDetails();
	}

}
