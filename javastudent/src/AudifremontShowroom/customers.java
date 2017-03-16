package AudifremontShowroom;

public class customers {

	private int invoiceno;
	private String customerFirstname;
	private String customerLastname;
	private String customerEmail;
	private long customerPhonenoL;
	private String address;
	 carsInventory  cars;
	
	public customers(int invoiceno, String customerFirstname, String customerLastname, String customerEmail,
			long customerPhonenoL, String address, carsInventory car) {
		super();
		this.invoiceno = invoiceno;
		this.customerFirstname = customerFirstname;
		this.customerLastname = customerLastname;
		this.customerEmail = customerEmail;
		this.customerPhonenoL = customerPhonenoL;
		this.address = address;
		this.cars = car;
		
	}

	public int getInvoiceno() {
		return this.invoiceno;
	}

	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}

	public String getCustomerFirstname() {
		return this.customerFirstname;
	}

	public void setCustomerFirstname(String customerFirstname) {
		this.customerFirstname = customerFirstname;
	}

	public String getCustomerLastname() {
		return this.customerLastname;
	}

	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public long getCustomerPhonenoL() {
		return this.customerPhonenoL;
	}

	public void setCustomerPhonenoL(long customerPhonenoL) {
		this.customerPhonenoL = customerPhonenoL;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
