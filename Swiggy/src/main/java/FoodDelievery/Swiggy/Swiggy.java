package FoodDelievery.Swiggy;

import java.io.IOException;

public class Swiggy extends Hotel
{
	

	
	public void order(String hotelName , String expectedItem , int quantity ) throws IOException
	{
		ReadHotelData rhd = new ReadHotelData();
		boolean hotelStatus = rhd.readHotelData("Hotels",  hotelName);
		if(hotelStatus) 
		{
			System.out.println("The Hotel is avaialable.");
			System.out.println("Kindly place the order.");
			
			String available = rhd.readItemData(hotelName, expectedItem);
			
			if(available==null)
			{
				System.out.println("Item is not available");   
			}
			else
			{
				int itemExist = GetItemExistWithPrice(available,quantity);
			    System.out.println("total price is : "+itemExist);
	
			}
			
			
		}
		
		else
		{
			System.out.println("The selected Hotel is not available");
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Swiggy s = new Swiggy();
		s.order("Buhari", "Chicken Briyani", 5);
		
		//rhd.readHotelItemData(Buhari, A2B);
//		Order.KaienthiBhavan();//to get hotel and dish from excel file from Hotel class
//		A2B obja2b = new A2B();
//		obja2b.readHotelDataa();
		
		//Hotel h = new Swiggy();
		//Order.item();
//		A2B obj = new A2B();
		
//		obj.fileReadA2B();
//		//if(Order.HotelName("A2B")) 
//		{
//			System.out.println("The hotel is available");
//			
//			if(Order.ItemName("Barotta"))
//				{
//					System.out.println("The Item is available"/*+Order.orderamount()*/);
//					System.out.println("Price is "+Order.orderamount()+" Rupees");
//				}
//			else
//				{
//				    System.out.println("The item is not available");
//				}
//		}
//		//else
//		{
//			System.out.println("The hotel is not available");
//		}

	}

}
