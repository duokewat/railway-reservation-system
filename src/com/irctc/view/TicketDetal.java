package com.irctc.view;

public class TicketDetal extends AbstractTicket {
	private String pnrNumber;
	
	public String getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	
	public String toString() {
		return "Name:"+getPassengerName()+", Age:"+getPassengerAge()+", From:"+getFrom()+", To:"+getTo()+", Train:"+getTrain()+", Date:"+getDate();
	}
	
}
