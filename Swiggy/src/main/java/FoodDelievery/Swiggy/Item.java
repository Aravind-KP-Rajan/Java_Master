package FoodDelievery.Swiggy;

public class Item extends Bill  {
	
	String[] Items = {"Dosa","Idly","Briyani","Chickenrice","Barotta"};
	
	
	//public boolean GetItemExistWithPrice()
	{
	}
		public boolean ReadItemExist(String hotelName, String expectedItem) 
		{
			if (hotelName != null)
			{
				return true;
			}
			return false;
		}
	
		
	public boolean ItemName(String OrderedItem)
		{
		for (int i=0; i<Items.length; i++)
		{
			if(OrderedItem.equalsIgnoreCase(Items[i])) 
				{
					return true;
				}
		}
		return false; 
		}
	}

		 
		
