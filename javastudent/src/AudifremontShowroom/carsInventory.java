package AudifremontShowroom;

public class carsInventory extends invoice {
	private String carmodel;
	private int caryear;
	private String carbodytype;
	private String carcolor;
	public carsInventory(double priceofcar, String description, int quantity, double amountpay, String carmodel,
			int caryear, String carbodytype, String carcolor) {
		super(priceofcar, description, quantity, amountpay);
		this.carmodel = carmodel;
		this.caryear = caryear;
		this.carbodytype = carbodytype;
		this.carcolor = carcolor;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public int getCaryear() {
		return caryear;
	}
	public void setCaryear(int caryear) {
		this.caryear = caryear;
	}
	public String getCarbodytype() {
		return carbodytype;
	}
	public void setCarbodytype(String carbodytype) {
		this.carbodytype = carbodytype;
	}
	public String getCarcolor() {
		return carcolor;
	}
	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}
	
	
	 
	
}
