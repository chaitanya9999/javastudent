package AudifremontShowroom;

public class customers extends carsInventory {

	private int invoiceno;
	private String customerFirstname;
	private String customerLastname;
	private String customerEmail;
	private long customerPhonenoL;
	private String address;
	public customers(double priceofcar, String description, int quantity, double amountpay, String carmodel,
			int caryear, String carbodytype, String carcolor, int invoiceno, String customerFirstname,
			String customerLastname, String customerEmail, long customerPhonenoL, String address) {
		super(priceofcar, description, quantity, amountpay, carmodel, caryear, carbodytype, carcolor);
		this.invoiceno = invoiceno;
		this.customerFirstname = customerFirstname;
		this.customerLastname = customerLastname;
		this.customerEmail = customerEmail;
		this.customerPhonenoL = customerPhonenoL;
		this.address = address;
	}
	public int getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}
	public String getCustomerFirstname() {
		return customerFirstname;
	}
	public void setCustomerFirstname(String customerFirstname) {
		this.customerFirstname = customerFirstname;
	}
	public String getCustomerLastname() {
		return customerLastname;
	}
	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getCustomerPhonenoL() {
		return customerPhonenoL;
	}
	public void setCustomerPhonenoL(long customerPhonenoL) {
		this.customerPhonenoL = customerPhonenoL;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
