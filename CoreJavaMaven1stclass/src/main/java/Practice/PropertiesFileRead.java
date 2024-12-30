package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Properties;

public class PropertiesFileRead {
	
	String filepath = "C:\\Users\\aravi\\eclipse-workspace\\CoreJavaMaven1stclass\\src\\main\\java\\Practice\\Input\\DOB.properties";

	public void propertiesRead() throws IOException, ParseException {
		File f = new File(filepath);
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);	
		System.out.println("your Date Of Birth (in yyyy-MM-dd) is: " + p.getProperty("DOB"));
//		DateTimeFormatter DOBformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		String DOBtext = p.getProperty("DOB").formatted(DOBformatter);
//		System.out.println("your Date Of Birth is: " +DOBtext);
		 
		ageCalculator(p.getProperty("DOB"));
	}
	public void ageCalculator(String xy)  
	{
		LocalDate today = LocalDate.now(); 
		LocalDate DOBDate = LocalDate.parse(xy); //how x works instaed of DOB.
		System.out.println("you are "+Period.between(DOBDate,today).getYears()+" years old");
		//System.out.println(DOBDate);
		 // LocalDate date = LocalDate.now();
//		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		  String text = today.format(formatter);
//		  LocalDate parsedDate = LocalDate.parse(text, formatter); 
//		  System.out.println("Todays date is: "+text);
 
		  
			 /*
			 * DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			 * String texts =today.format(formatters);
			 * System.out.println(formatters);
			 */
		
		//SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
		//LocalDate d5 = LocalDate.parse("2000-07-08");
		//System.out.println(today);
		//String formattedDate = today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		//System.out.println(formattedDate);
		//SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
		//LocalDate d3 = LocalDate.parse(formattedDate);
		//LocalDate d4 = LocalDate.parse(DOB);
		
		/*
		 * Date d1 = obj.parse(formattedDate); Date d2 = obj.parse(DOB);
		 * System.out.println(d1); System.out.println(d2);
		 */
		 
		//System.out.println(d3); 
		//System.out.println(d4);
		//long age = java.time.temporal.ChronoUnit.YEARS.between(d5, today);
		
	}
	
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		PropertiesFileRead pfr = new PropertiesFileRead();
		pfr.propertiesRead();

	}

}
