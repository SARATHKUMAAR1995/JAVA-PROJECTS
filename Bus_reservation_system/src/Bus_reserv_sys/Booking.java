package Bus_reserv_sys;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat; 


public class Booking {
	String passengername;
	int busno;
	Date date;
	
	Booking(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter pasenger name : ");
		passengername = s.nextLine();
		System.out.println("Enter bus no : ");
		busno = s.nextInt();
		
		// date always inputs as String so convert to date format
		System.out.println("Enter date in dd/mm/yyyy :");
		String dateInput = s.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date =dateformat.parse(dateInput);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		}
		public boolean isAvailable(ArrayList<Booking>bookings,ArrayList <Bus> buses) {
			int capacity = 0;
			for(Bus bus :buses) {
				if(bus.getBusno()==busno) {
					capacity = bus.getCapacity();
				}
				
			}
			int booked = 0;
			for(Booking b : bookings) {
				if(b.busno == busno && b.date.equals(date));
				booked++;
			}
			return booked <capacity?true:false;
			
		
	}

	public static void main(String[] args) {
		

	}

}
