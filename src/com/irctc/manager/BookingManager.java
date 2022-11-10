package com.irctc.manager;

import java.util.concurrent.ThreadLocalRandom;

import com.irctc.TicketDatabase;
import com.irctc.view.BookingDetail;
import com.irctc.view.TicketDetal;

public class BookingManager {
	public String doBook(BookingDetail bookingDetail) {
		
		String pnr = getPnr();
		TicketDetal ticketDetal = new TicketDetal();
		
		ticketDetal.setPnrNumber(pnr);
		ticketDetal.setPassengerName(bookingDetail.getPassengerName());
		ticketDetal.setPassengerAge(bookingDetail.getPassengerAge());
		ticketDetal.setDate(bookingDetail.getDate());
		ticketDetal.setFrom(bookingDetail.getFrom());
		ticketDetal.setTo(bookingDetail.getTo());
		ticketDetal.setTrain(bookingDetail.getTrain());
		TicketDatabase.dataBase.put(pnr, ticketDetal);
		return pnr;
	}
	
	private String getPnr() {
		return "PNR"+ThreadLocalRandom.current().nextInt(100, 10000 + 1);
	}
}
