package AudifremontShowroom;

public class carsInventory {
	private String carmodel;
	private int caryear;
	private String carbodytype;
	private String carcolor;
	public carsInventory(String carmodel, int caryear, String carbodytype, String carcolor) {
		this.carmodel = carmodel;
		this.caryear = caryear;
		this.carbodytype = carbodytype;
		this.carcolor = carcolor;
	}
	public String getCarmodel() {
		return this.carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public int getCaryear() {
		return this.caryear;
	}
	public void setCaryear(int caryear) {
		this.caryear = caryear;
	}
	public String getCarbodytype() {
		return this.carbodytype;
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
