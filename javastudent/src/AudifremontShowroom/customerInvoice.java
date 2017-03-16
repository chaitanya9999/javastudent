package AudifremontShowroom;

public class customerInvoice {
	
public static void main(String[] args){
		
		carsInventory inventory = new carsInventory ("Audi A6",2017,"Luxury vehicle","Gray");
		carsInventory inventory1 = new carsInventory ("Audi A8",2017,"Luxury vehicle","Black");
		carsInventory inventory2 = new carsInventory ("Audi A5",2017,"Luxury vehicle","White");
		carsInventory inventory3= new carsInventory ("Audi TT",2017,"Luxury vehicle","Red");
		carsInventory inventory4 = new carsInventory ("Audi A4",2017,"Luxury vehicle","GrayBlue");
		carsInventory inventory5 = new carsInventory ("Audi Q5",2017,"Luxury vehicle","Orange");
		
		
		customers user = new customers(5000109,"kim","williams","williams689@gmail.com",5106747626L,"40640 High Street",inventory);
		customers user1 = new customers(5000110,"john","smith","john27@gmail.com",5107867561L,"4200 bay Street",inventory1);
		customers user2 = new customers(5000111,"vicky","harris","vicky198@gmail.com",5106747626L,"40674 high Street",inventory3);
		customers user3 = new customers(5000112,"james","Brown","james7654@gmail.com",510765941L,"40670 High Street",inventory4);
		customers user5 = new customers(5000112,"lee","hall","lee1987@gmail.com",510765941L,"101 lincon Street",inventory5);
		
		

		System.out.println("********Customer Details***********");
			
			System.out.println("First Name:"+" "+user5.getCustomerFirstname());
			System.out.println("Last Name:"+" "+user5.getCustomerLastname());
			System.out.println("Invoice Number:"+" "+user5.getInvoiceno());
			System.out.println("Email:"+" "+user5.getCustomerEmail());
			System.out.println("Phone Number:"+" "+user5.getCustomerPhonenoL());
			System.out.println(" Address:"+" "+user5.getAddress());
			
			System.out.println("********Car Inventory Details***********");
			System.out.println("Car Model :"+" "+user5.cars.getCarmodel());
			System.out.println("Car year:"+" "+user5.cars.getCaryear());
			System.out.println("Car Body Type:"+" "+user5.cars.getCarbodytype());
			System.out.println("Car Color:"+" "+user5.cars.getCarcolor());
		
		
	
	System.out.println("********Customer Details***********");
		
		System.out.println("First Name:"+" "+user3.getCustomerFirstname());
		System.out.println("Last Name:"+" "+user3.getCustomerLastname());
		System.out.println("Invoice Number:"+" "+user3.getInvoiceno());
		System.out.println("Email:"+" "+user3.getCustomerEmail());
		System.out.println("Phone Number:"+" "+user3.getCustomerPhonenoL());
		System.out.println(" Address:"+" "+user3.getAddress());
		
		System.out.println("********Car Inventory Details***********");
		System.out.println("Car Model :"+" "+user3.cars.getCarmodel());
		System.out.println("Car year:"+" "+user3.cars.getCaryear());
		System.out.println("Car Body Type:"+" "+user3.cars.getCarbodytype());
		System.out.println("Car Color:"+" "+user3.cars.getCarcolor());
   
		
		
		System.out.println("********Customer Details***********");
		
		System.out.println("First Name:"+" "+user2.getCustomerFirstname());
		System.out.println("Last Name:"+" "+user2.getCustomerLastname());
		System.out.println("Invoice Number:"+" "+user2.getInvoiceno());
		System.out.println("Email:"+" "+user2.getCustomerEmail());
		System.out.println("Phone Number:"+" "+user2.getCustomerPhonenoL());
		System.out.println(" Address:"+" "+user2.getAddress());
		
		System.out.println("********Car Inventory Details***********");
		System.out.println("Car Model :"+" "+user2.cars.getCarmodel());
		System.out.println("Car year:"+" "+user2.cars.getCaryear());
		System.out.println("Car Body Type:"+" "+user2.cars.getCarbodytype());
		System.out.println("Car Color:"+" "+user2.cars.getCarcolor());
   
		 System.out.println("********Customer Details***********");
		
		System.out.println("First Name:"+" "+user1.getCustomerFirstname());
		System.out.println("Last Name:"+" "+user1.getCustomerLastname());
		System.out.println("Invoice Number:"+" "+user1.getInvoiceno());
		System.out.println("Email:"+" "+user1.getCustomerEmail());
		System.out.println("Phone Number:"+" "+user1.getCustomerPhonenoL());
		System.out.println(" Address:"+" "+user1.getAddress());
		
		System.out.println("********Car Inventory Details***********");
		System.out.println("Car Model :"+" "+user1.cars.getCarmodel());
		System.out.println("Car year:"+" "+user1.cars.getCaryear());
		System.out.println("Car Body Type:"+" "+user1.cars.getCarbodytype());
		System.out.println("Car Color:"+" "+user1.cars.getCarcolor());
		
System.out.println("********Customer Details***********");
		
		System.out.println("First Name:"+" "+user.getCustomerFirstname());
		System.out.println("Last Name:"+" "+user.getCustomerLastname());
		System.out.println("Invoice Number:"+" "+user.getInvoiceno());
		System.out.println("Email:"+" "+user.getCustomerEmail());
		System.out.println("Phone Number:"+" "+user.getCustomerPhonenoL());
		System.out.println(" Address:"+" "+user.getAddress());
		
		System.out.println("********Car Inventory Details***********");
		System.out.println("Car Model :"+" "+user.cars.getCarmodel());
		System.out.println("Car year:"+" "+user.cars.getCaryear());
		System.out.println("Car Body Type:"+" "+user.cars.getCarbodytype());
		System.out.println("Car Color:"+" "+user.cars.getCarcolor());
	
		
	
	
		
	}
	
	
}
	
	
	
	
	


