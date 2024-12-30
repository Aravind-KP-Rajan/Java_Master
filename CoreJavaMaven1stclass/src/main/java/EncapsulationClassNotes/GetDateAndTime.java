package EncapsulationClassNotes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetDateAndTime {

	public void GetCurrentDate()
	{
		LocalDate l =  LocalDate.now();
		System.out.println(l);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = l.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);


	}

	public void GetCurrentTime()
	{
		LocalTime l =  LocalTime.now();
		System.out.println(l);
		String time = l.toString();
		System.out.println(time.substring(0,5));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetDateAndTime g = new GetDateAndTime();
		g.GetCurrentDate();
		g.GetCurrentTime();
	}

}
