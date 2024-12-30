package SwiggyDup;

public class Swiggy extends Hotel 
{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swiggy Order = new Swiggy();
		if(Order.HotelName("A2B")) 
		{
			System.out.println("The hotel is available");
			
			if(Order.ItemName("Barotta"))
				{
					System.out.println("The Item is available"/*+Order.orderamount()*/);
					System.out.println("Price is "+Order.orderamount()+" Rupees");
				}
			else
				{
				    System.out.println("The item is not available");
				}
		}
		else
		{
			System.out.println("The hotel is not available");
		}

	}

}
