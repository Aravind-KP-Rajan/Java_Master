package SwiggyDup;

public class Item  extends Bill{
	
	String[] Items = {"Dosa","Idly","Briyani","Chickenrice","Barotta"};
	
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

		 
		
