package SwiggyDup;

public class Hotel extends Item {
	
	String[] Hotels = {"Pandian Hotel","Chettinadu Hotel","Kaienthi Bavan","A2B"};

	public boolean HotelName(String SelectedHotel)
	{	
		for(int i =0;i<Hotels.length;i++) 
		{
			if(SelectedHotel.equalsIgnoreCase(Hotels[i]))
			{
				return true; 
			} 
		}
		return false; 
	} 
}
