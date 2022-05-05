package com.org.JavaFundamental.CapstoneProject.HomeStayBooking;

public class HomeStayBookingDriver {
	public static void main(String agrs[]) {
		
//		(Name, Room type, NoOfExtraPerson, NoOfDaysToStay )
		RoomDetails rd = new RoomDetails("Oscar", "Delux", 1, 1);
		System.out.println("Total Bill: "+ rd.calculateBill() +" Rs.");


		RoomDetails rd1 = new RoomDetails("Malika", "Standard", 2, 10);
		System.out.println("Total Bill: "+ rd1.calculateBill() +" Rs.");


		RoomDetails rd3 = new RoomDetails("Samayra", "Standard", 6, 20);
		System.out.println("Total Bill: "+ rd3.calculateBill() +" Rs.");

//
		RoomDetails rd4 = new RoomDetails("Sam Malik", "Pent House", 0, 5);	
		System.out.println("Total Bill: "+ rd4.calculateBill() +" Rs.");

		RoomDetails rd5 = new RoomDetails("Khonshoo", "Cottage", 2, 5);	
		System.out.println("Total Bill: "+ rd5.calculateBill() +" Rs.");

	}


}
