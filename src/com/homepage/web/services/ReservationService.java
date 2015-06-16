package com.homepage.web.services;

public interface ReservationService {
	// public int inputCheck(String input, int first, int last);
	public String checkIn(int floor, int row, String id);
	public String checkOut(int floor, int row, String id);
	public String[][] showStatus();
	public void process();
	
	
}
