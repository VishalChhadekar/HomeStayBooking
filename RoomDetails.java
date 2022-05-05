package com.org.JavaFundamental.CapstoneProject.HomeStayBooking;

public class RoomDetails implements RoomBillComponent {
	private int billId;
	private String customerName;
	private String typeOfRoom;
	private int noOfExtraPerson;
	private int noOfDaysOfStay;
	private static int counter;
	
	static {
		counter = 1000;
	}
	
	//class constructor
	RoomDetails(String customerName, String typeOfRoom, int noOfExtraPerson, int noOfDaysOfStay){
		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfDaysOfStay = noOfDaysOfStay;
		this.noOfExtraPerson = noOfExtraPerson;
		this.billId = counter;
		
	}
	//getter and setter methods

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}

	public int getNoOfExtraPerson() {
		return noOfExtraPerson;
	}

	public void setNoOfExtraPerson(int noOfExtraPerson) {
		this.noOfExtraPerson = noOfExtraPerson;
	}

	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}

	public void setNoOfDaysOfStay(int noOfDaysOfStay) {
		this.noOfDaysOfStay = noOfDaysOfStay;
	}
	

	// methods for validation
	public boolean validateNoOfExtraPerson() {
		if(noOfExtraPerson<=2 && noOfExtraPerson>=0) {
			return true;
		}
		return false;	
	}
	
	public boolean validateNoOfDaysStay() {
		if(noOfDaysOfStay>0 && noOfDaysOfStay<=15) {
			return true;
		}
		return false;
	}
	
	public boolean validateTypeOfRoom() {
		if(typeOfRoom.equals("Standard")) {
			return true;
		}
		else if(typeOfRoom.equals("Delux")) {
			return true;
		}
		else if(typeOfRoom.equals("Cottage")) {
			return true;
		}
		return false; 
	}

	//bill calculation
	@Override
	public float calculateBill() {
		int baseRoomFare = 0;
		float totalBill=0;
		if(validateTypeOfRoom()==true && validateNoOfDaysStay()==true && validateNoOfExtraPerson()==true) {
			counter++;
		
			if(validateTypeOfRoom()==true) {
				if(typeOfRoom.equals("Standard")) {
					baseRoomFare = 2500;
					
				}
				else if(typeOfRoom.equals("Delux")) {
					baseRoomFare = 3500;
					
				}
				else if(typeOfRoom.equals("Cottage")) {
					baseRoomFare = 5500;
					
				}
			}
			//billcalculation
			totalBill =(float) ((float) (baseRoomFare*noOfDaysOfStay)+(noOfDaysOfStay*(FOOD_CHARGE))+(EXTRA_PERSON_CHARGE*noOfExtraPerson));
			totalBill = (float) (totalBill + (TAX/100)*totalBill);
			
			System.out.println("BillId: "+ billId+ "\nCustomer Name: "+ customerName+
					"\nNo. 0f days of Stay: "+ noOfDaysOfStay);
		
		}
		else {
			if(validateTypeOfRoom()==false) {
				System.out.println("Invalid Room Type");
			}
			else if(validateNoOfDaysStay()==false)
			{
				System.out.println("Can't stay more than 15 days");
			}
			else if(validateNoOfExtraPerson()==false) {
			System.out.println("Can't stay more than 2 persons");
			}
		}
		return totalBill;

	}


}
