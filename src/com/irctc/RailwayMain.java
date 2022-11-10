package com.irctc;

import com.irctc.manager.BookingManager;
import com.irctc.view.BookingDetail;

public class RailwayMain {

	public static void main(String[] args) {
		String pnr = new RailwayMain().doBook(); //Books the Ticket
		
		new RailwayMain().getBookingDetail(); //Shows the Ticket detail
		
		new RailwayMain().cancelTicket(pnr);//Cancels the ticket based on PNR
		
		new RailwayMain().getBookingDetail();//Shows the Ticket detail
	}
	
	private String doBook() {
		BookingDetail bookingDetail = new BookingDetail();
		
		bookingDetail.setPassengerName("Marshal");
		bookingDetail.setPassengerAge(21);
		bookingDetail.setFrom("Coimbatore");
		bookingDetail.setTo("Chennai");
		bookingDetail.setDate("20-12-2022");
		bookingDetail.setTrain("Covai Express");
		
		String pnr = new BookingManager().doBook(bookingDetail);
		System.out.println("Ticket Booked Succesfully for "+bookingDetail.getPassengerName());
		return pnr;
	}
	
	private void getBookingDetail() {
		System.out.println(TicketDatabase.dataBase);
	}
	
	private void cancelTicket(String pnr) {
		System.out.println("Going to Cancel PNR "+pnr);
		TicketDatabase.dataBase.remove(pnr);
		System.out.println("Ticket canceled Succesfully !");
	}
}
