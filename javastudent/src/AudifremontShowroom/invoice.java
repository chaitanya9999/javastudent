package AudifremontShowroom;

public class invoice  {

	private double priceofcar;
	private String description;
	private int quantity;
	private double amountpay;
	
	
   public invoice(double priceofcar, String description, int quantity, double amountpay) {
		this.priceofcar = priceofcar;
		this.description = description;
		this.quantity = quantity;
		this.amountpay = amountpay;
	}
	public double getPriceofcar() {
		return this.priceofcar;
	}
	public void setPriceofcar(double priceofcar) {
		this.priceofcar = priceofcar;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmountpay() {
		return this.amountpay;
	}
	public void setAmountpay(double amountpay) {
		this.amountpay = amountpay;
	}
	
	
	
	
	
	
		}
